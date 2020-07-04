package chapter6_typeandnullable

fun main() {
    ifNonNull("")
    ifNonNull("Kotlin-MultiPlatform")
    ifNonNull(null)
}

fun ifNonNull(str: String?) {
    val length = str?.length
    println("length = $length")
}