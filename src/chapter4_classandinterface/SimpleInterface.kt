package chapter4_classandinterface

fun main() {
    val button = Button()
    button.click()
    button.draw()
    button.measure()
    button.onButtonClick()
}

interface View {
    fun draw() {
        println("Draw ${javaClass.name}")
    }

    fun measure()
    fun click() {
        println("Click View")
    }
}

interface Clickable {
    fun click() {
        println("Click Clickable")
    }
}