package chapter8_higherolderfunction

import chapter2_basic.Person
import chapter2_basic.defaultPersonList

/**
 * 注意几种返回方式的语法。
 */
fun main() {
    val persons = defaultPersonList()

    println("0")
    persons.loop { p: Person ->
        println(p.name)
        if (p.name == "lp5") return
    }

    println("0")
    // forEach 也是内联函数
    persons.forEach { p: Person ->
        println(p.name)
        if (p.name == "lp5") return
    }

}

/**
 * 注意内联函数的lambda参数中的返回
 */
inline fun <T> List<T>.loop(f: (t: T) -> Unit) {
    for (element in this) f(element)
}