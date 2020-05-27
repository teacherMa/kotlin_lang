package chapter3_function

fun main() {

}

val String.lastChar: Char
    get() {
        return get(length - 1)
    }