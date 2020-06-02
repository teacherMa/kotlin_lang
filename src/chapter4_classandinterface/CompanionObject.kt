package chapter4_classandinterface

/**
 * 可以把伴生对象当作Java中的静态属性。
 */
fun main() {
    objectCreator(Person.PersonFactory)
    objectCreator(Person.PersonFactory)
    Person.createFrom(null)
    Person.createFrom(null)
    Person.print()
}

fun <T> objectCreator(factory: JSONFactory<T>) {
    factory.createFrom("")
}

class Person {
    var name: String = ""
    var age: Int = 0

    companion object PersonFactory : JSONFactory<Person> {
        var refCount: Int = 0
        override fun createFrom(json: String?): Person {
            refCount++
            return Person()
        }
    }
}

/**
 * 伴生对象也可以有扩展函数
 */
fun Person.PersonFactory.print() {
    println("This is a extend function of companion object, Companion Object reference $refCount timse")
}

interface JSONFactory<T> {
    fun createFrom(json: String?): T
}