package chapter4_classandinterface

/**
 * Kotlin 中构造函数的规则和Java中的类似。
 * 子类实际上持有一个父类对象，所以子类中必须调用父类的构造函数。
 * 如果没有定义带参数的构造函数，Kotlin会自动生成无参数的构造函数。
 * 和类名放在一起的构造函数叫primary constructor，类中使用constructor声明的叫做secondary constructor。
 * 主构造函数如果没有额外的修饰符，可以省略constructor关键字
 * 可以有多个init块，init块与属性初始化语句按照它们在类中放置的顺序执行。
 * */
fun main() {
//    val son = Son()
//    ASon()
//    BSon("BSon")
    MainInit("MainInit")
}

class MainInit constructor(_name: String) {
    var hash = "First property: $_name".also(::println)

    init {
        println("This is First init block $_name")
    }

    var name = "Second property :$_name".also(::println)

    init {
        println("This is second init bolck")
    }
}

class SecondInit {
    val a: Int

    /**
     * You can define a lot of secondary constructor, but use default value param to avoid do that.
     * */
    constructor() {
        a = 1
    }
}

open class Father {
    constructor(str: String) {
        println("Father of $str")
    }
}

class Son : Father {
    constructor() : super("Son") {
        println("Son")
    }
}

class ASon : Father("ASon Father") {

}

class BSon(str: String) : Father(str) {

}

data class Setting(val version: String) {

    constructor() : this("") {

    }
}


