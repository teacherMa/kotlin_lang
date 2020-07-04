package chapter6_typeandnullable

import chapter3_function.*

fun main() {
    /**
     * see [isNullOrBlank]
     */
    var str: String? = "isNullOrBlank"
    println(str.isNullOrBlank())
    str = null
    println(str.isNullOrBlank())
}