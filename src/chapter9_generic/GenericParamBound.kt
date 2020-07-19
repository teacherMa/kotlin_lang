package chapter9_generic

import kotlin.reflect.KClass

fun main() {

}

/**
 * 如果范型参数没有指定上界，则范型参数的类型默认为 Any？
 */
fun <T> print(t: T) {
    // Compile error
//    getClass(t)
}

fun <T : Any> printNoNull(t: T) {

}

/**
 * Specify multiple upper bounds for the generic parameter
 */
fun <T> showMessage(message: T) where T : Any, T : Appendable {

}

fun getClass(obj: Any) {
    println(obj::class)
}

