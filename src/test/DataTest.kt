package test

//data class Computer(val name: String, val screen: Screen)

//data class Screen(val width: Int, val height: Int)

fun main() {
    val runEvents = mutableMapOf<String, MutableSet<String>>()
    runEvents["sdk"]?.addAll(arrayOf("123")) ?: arrayOf("123")
}