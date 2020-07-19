package test

import chapter2_basic.Color

fun main() {
    val bytes = "Hello".toByteArray(Charsets.UTF_8)
    println(bytes)
    println(bytes.toString(Charsets.UTF_8))
}