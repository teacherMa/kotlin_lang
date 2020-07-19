package chapter10_reflectandannotation

/**
 * [AnnotationTarget.ANNOTATION_CLASS] means there is a meta-annotation.
 * Annotation in Kotlin always be saved to runtime.
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.ANNOTATION_CLASS)
annotation class Serialize(val name: String)

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
annotation class Exclude