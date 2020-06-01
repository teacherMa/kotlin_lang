package chapter4_classandinterface

fun main() {
    val b = AppCompatImageButton()
}

open class Button : View, Clickable {
    override fun measure() {
        println("Measure Button")
    }

    override fun click() {
        super<View>.click()
        super<Clickable>.click()
    }

    open fun onButtonClick() {
        println("Button Click")
    }
}

open class ImageButton : Button() {
    override fun onButtonClick() {
        super.onButtonClick()
        println("Image Button Click")
    }
}

/**
 * 一个类继承另一个类，不会把类的open修饰符也继承了；
 * 一个方法重写另一个方法，会继承这个方法的open修饰符。
 * */
open class AppCompatImageButton : ImageButton() {

    override fun onButtonClick() {
        super.onButtonClick()
    }

    private fun compatFun() {

    }
}

abstract class AbsCompatButton : AppCompatImageButton() {
    abstract fun absFun()
}