package chapter2_basic

fun main() {
    val me = Person();
    println(me.name);
    me.name = "House Grey Grey"
    println(me.isYoung)
}

class Person {
    var name: String = ""
        get() {
            return field + age;
        }
        set(value) {
            field = value
            println("set getName to $field")
        }

    private var age: Int = 0
    var isYoung: Boolean = false
        get() {
            return if (age < 18) {
                println("get isYong is True")
                false
            } else {
                println("get isYong is False")
                true
            }
        }
        private set(value) {
            field = value
            println("set isYoung $field")
        }
}