package chapter6_typeandnullable

fun main() {
    nullable("Kotlin")
    nullable(null)
}

fun nullable(str: String?) {
    nonNull(str!!)
}

fun nonNull(str: String) {
    println("message is $str, length = ${str.length}")
}