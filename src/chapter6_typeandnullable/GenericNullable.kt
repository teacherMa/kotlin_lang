package chapter6_typeandnullable

fun main() {

}

/**
 * Generic param is nullable by default
 */
fun <T> printType(t: T) {
    println(t?.hashCode())
}

/**
 * Generic param is not-null if specify it's upper bound
 */
fun <T : Any> printTypeNonNull(t: T) {
    println(t.hashCode())
}
