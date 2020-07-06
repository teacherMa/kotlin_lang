package chapter7_operatorandconvention

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class ObservablePerson(val name: String, age: Int, salary: Int) {
    var age: Int by Delegates.observable(age)
    { property: KProperty<*>, oldValue: Int, newValue: Int -> println("${property.name} has changed, from $oldValue to $newValue") }

    var salary: Int by Delegates.observable(salary)
    { property: KProperty<*>, oldValue: Int, newValue: Int -> println("${property.name} has changed, from $oldValue to $newValue") }

    private val attributes = hashMapOf<String, String>()

    val address: String by attributes

    fun setAttributes(name: String, value: String) {
        attributes[name] = value
    }
}


fun main() {
    val p = ObservablePerson("anonymous", 23, 8000)
    for (i in 24..30) {
        p.age = i
        p.salary = 8000 + (i - 23) * 1000
    }

    p.setAttributes("address", "shenzhen")
    println(p.address)
}