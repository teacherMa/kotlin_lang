/**
 * Kotlin 中，is 相当于 Java中的instanceof，并且对于使用 is 判断后，不再发生变化的对象，编译器会自动进行 as 转化。
 * */
fun main() {
    println(eval(Sum(Sum(Num(1), Num(1)), Num(1))))
}

interface Expr {
}

class Num(val value: Int) : Expr {
}

class Sum(val left: Expr, val right: Expr) : Expr {
}

fun eval(expr: Expr): Int {
    return when (expr) {
        is Num -> {
            expr.value
        }
        is Sum -> {
            eval(expr.left) + eval(expr.right)
        }
        else -> {
            0
        }
    }
}

