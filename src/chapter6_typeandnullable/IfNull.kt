package chapter6_typeandnullable

fun main() {
    ifNull("nonull")
    ifNull(null)
}

fun ifNull(str: String?) {
    val s: String = str ?: ""
    println(s)
}