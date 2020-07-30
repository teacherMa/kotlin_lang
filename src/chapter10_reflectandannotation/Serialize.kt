package chapter10_reflectandannotation

import kotlin.reflect.KClass
import kotlin.reflect.KParameter
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty1
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor

/**
 * [AnnotationTarget.ANNOTATION_CLASS] means there is a meta-annotation.
 * Annotation in Kotlin always be saved to runtime.
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.ANNOTATION_CLASS)
annotation class Serialize(val name: String = "")

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
annotation class Exclude

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
annotation class SerializeName(val name: String)

var serializeResult: String = ""

fun toJsonString(obj: Any): String {
    val kotlinClass = obj::class
    val sb = StringBuilder("{")
    kotlinClass.findAnnotation<Serialize>()
            ?: throw IllegalArgumentException("This method can only be called on the annotated class")
    val properties = kotlinClass.memberProperties
    properties.filter { property: KProperty1<out Any, Any?> ->
        property.findAnnotation<Exclude>() == null
    }.forEach { property: KProperty1<out Any, Any?> ->
        property.findAnnotation<SerializeName>()
                ?.let { serializeName: SerializeName ->
                    sb.append("\"").append(serializeName.name).append("\"").append(":").append(serializeProperty(property.call(obj))).append(",")
                }
                ?: sb.append("\"").append(property.name).append("\"").append(":").append(serializeProperty(property.call(obj))).append(",")
    }
    sb.delete(sb.length - 1, sb.length)
    sb.append("}")
    return sb.toString()
}

fun serializeProperty(any: Any?): Any {
    any ?: return ""
    return if (any is String) {
        "\"$any\""
    } else {
        any
    }
}

fun getObjectByName(className: String): Any? {
    val kClass = Class.forName(className).kotlin
    val primaryConstruct = kClass.primaryConstructor
    val parameters = primaryConstruct?.parameters
    return parameters?.let {
        val mMap = mutableMapOf<KParameter, Any?>()
        it.forEach { kParameter: KParameter ->
            mMap[kParameter] = kParameter.getTypeDefaultValue()
        }
        primaryConstruct.callBy(mMap)
    }
}

fun KParameter.getTypeDefaultValue(): Any? {
    return when (type.classifier) {
        Boolean::class -> true
        Int::class -> 0
        String::class -> ""
        else -> null
    }
}

fun main() {
    serializeResult = toJsonString(Chair(6000, true, "HumanScale", "Expensive and uncomfortable", "Stupid chair"));
    println(serializeResult)
    getObjectByName(Chair::class.java.name)?.apply {
        println(toJsonString(this))
    }
}