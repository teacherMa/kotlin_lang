package chapter3_function

fun main() {
    println(createMap())
    println(topLevelFunction(createList()))
    println(topLevelFunction(splitString()))
    println(createSet().max())
}

fun createMap(): Map<Any, Any> {
    return mapOf(1 to 1, 2 to 2)
}

fun createList(): List<Any> {
    return arrayListOf(1, 2, 3, 4, "123", true)
}

fun createSet(): Set<Int> {
    return setOf(1, 1, 1, 1, 1, 1)
}

fun splitString(): List<Int> {
    return arrayListOf(* arrayOf(1, 2, 3, 4, 5))
}

fun useVararg(vararg t : Int) {

}
