package chapter9_generic

fun main() {
    getClass(1)
    isType<Int>("Str")
    println(isTypeT<String>("Str"))
}

/**
 * "*" symbol indicates that "Any type is OK".
 * Just like symbol "?" in java.
 */
fun checkListType(input: Collection<*>) {
    // Compile error
//    println(input is Collection<String>)
}

fun <T : Any> getClass(t: T) {
    println(t::class.java)
}

fun <T> isType(obj: Any): Boolean {
    // Compile error
//    return obj is T
    TODO()
}

inline fun <reified T> isTypeT(obj: Any): Boolean {
    return obj is T
}
