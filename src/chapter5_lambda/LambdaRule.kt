package chapter5_lambda

import chapter2_basic.Person
import chapter2_basic.defaultPersonList

fun main() {
    val persons = defaultPersonList()
    // 基础版本，通过 -> 分割参数与函数体
    persons.groupBy({ p: Person -> p.isYoung })

    // lambda表达式可以移到括号外
    persons.groupBy() { p: Person -> p.isYoung }

    // 函数参数如果只有一个lambda表达式，括号可以省略
    persons.groupBy { p: Person -> p.isYoung }

    // 参数类型可以自动推断
    persons.groupBy { p -> p.isYoung }

    // 默认可以用it指代
    persons.groupBy { it.isYoung }
}