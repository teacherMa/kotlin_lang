package chapter2_basic

fun main() {
    val helloWorld = HelloWorld(1);
    helloWorld.helloWho("MaBen");
    println("newAge = ${helloWorld.changeAge(2)}")
    helloWorld.helloWho("MaBen")

    println(Color.BLUE.getNumber())
}

class HelloWorld(private var age: Int) {

    /**
     * Set age to a new value and return the new value.
     * @return The age's new value.
     */
    fun changeAge(newAge: Int): Int {
        age = newAge
        return age
    }

    fun helloWho(who: String) {
        println("Hello World, $who is $age");
    }
}