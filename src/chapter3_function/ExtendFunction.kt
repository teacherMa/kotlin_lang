package chapter3_function

/**
 * 扩展函数由静态类型决定，而不是运行时的动态类型。
 * 扩展函数不能被重写。
 * 扩展函数中不能访问接受者类型中的private和protect类型的方法与变量。
 * 扩展函数实际上是一种静态方法的语法糖，不属于类的继承结构。
 * */
fun main() {
    println("Kotlin".lastChar())
    println(arrayListOf(1, 2, 3, 4, 5, 6).joinToString())
    val view: View = Button()
    view.showOff()
}

/**
 * That's very very very interesting !!!
 * I don't have source code of String.kt, but I can add function to String
 * 扩展函数相当于Java的静态方法。
 * */
fun String.lastChar(): Char {
    return this[length - 1]
}

/**
 * final version.
 * */
fun <T> Collection<T>.joinToString(
    prefix: String = " ",
    suffix: String = " ",
    divider: String = " "
): String {
    val result = StringBuilder()
    result.append(prefix)
    for ((index, genData) in withIndex()) {
        result.append(genData)
        if (index < size - 1) {
            result.append(divider)
        }
    }
    result.append(suffix)
    return result.toString()
}

open class View(var x: Int) {

}

fun View.showOff() {
    println("I am View")
}

class Button : View(0) {

}

fun Button.showOff() {
    println("I am Button")
}


