package chapter4_classandinterface

/**
 * Kotlin 中构造函数的规则和Java中的类似。
 * 子类实际上持有一个父类对象，所以子类中必须调用父类的构造函数。
 * 如果没有定义带参数的构造函数，Kotlin会自动生成无参数的构造函数。
 * 在类名中直接声明的构造函数叫primary constructor，使用constructor声明的叫做secondary constructor
 * */
fun main() {
    val son = Son()
    ASon()
    BSon("BSon")
}

class MainInit constructor() {
    val hash: Int
    val name: String

    init {
        hash = 0
        name = ""
    }

    fun print() {
        println(hash)
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


