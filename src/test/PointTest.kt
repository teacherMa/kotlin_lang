package test

import chapter7_operatorandconvention.Point
import chapter7_operatorandconvention.contains
import chapter7_operatorandconvention.get
import chapter7_operatorandconvention.inc

fun main() {
    val p1 = Point(1, 1)
    var p2 = Point(2, 2)
    println(p1 + p2)
    println(p1 * 10)
    println(++p2)
    println(p1 == p2)
    println(p1[0])
    println(p1 in p2)

    // 解构声明,参考componentN
    val (x, y, z) = p1
    println("x = $x, y = $y, z = $z")
}
