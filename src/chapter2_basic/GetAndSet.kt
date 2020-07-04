package chapter2_basic

fun main() {
    val me = Person();
    println(me.name);
    me.name = "House Grey Grey"
    println(me.isYoung)
}

class Person(var name: String, var age: Int) {

    constructor() : this("anonymous", 0)

    val isYoung
        get() = age < 18

}

fun defaultPersonList(): List<Person> = listOf(Person("mahuihui", 23),
        Person("xixi", 23),
        Person("lypeer", 24),
        Person("lp5", 24))
