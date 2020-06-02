package chapter4_classandinterface

/**
 * "==" will invoke equals().
 * If you just want to compare two reference, use "==="
 * */
fun main() {
    val y7000 = Computer("y7000", 6000)
    val y7000R5 = Computer("y7000R5", 7000)
    val y70002 = Computer("y7000", 6000)
    println(y7000 == y7000R5)
    println(y7000 == y70002)
    println(MacBook("MacBook2019", 2019, 19999))
}

class Computer(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Computer) {
            other.name == name && other.price == price
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return name.hashCode() + price
    }
}

/**
 * Class declared with "data" will auto generate equals()、hashCode()、toString() by fields that declared in primary constructor.
 * Notice: only fields that declared in primary constructor will be used.
 * */
data class MacBook(val name: String, val productYear: Int, val price: Int) {

}