package chapter6_typeandnullable

fun main() {

}

fun createMethod() {
    val a1 = arrayOf(1, 2, 3, 4)
    val a2 = arrayOfNulls<Int>(10)
    val a3 = Array<String>(26) { ('a' + it).toString() }
//  What's the difference between line 10 and line 12
//    val a4 = Array<String>(26) { (it + 'a').toString() }
}

fun primitivesArray() {
    val aint = IntArray(5)
    val a = aint[0]
}