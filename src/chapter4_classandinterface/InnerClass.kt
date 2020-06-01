package chapter4_classandinterface

fun main() {

}

class Fruits {
    var name: String = ""
    val price: Int = 0

    /**
     * Normal inner class can't access outer class's instance
     * */
    private class FruitsPricePrint() {
        fun print() {
            // compile error
//            println("Price = $price")
        }
    }

    /**
     * Normal inner class declared with "inner" can access outer class's instance
     * */
    inner class FruitsNamePrint() {
        fun print() {
            println("Name = $name")
        }
    }
}


/**
 * if a class declared with sealed, all it's sub-class must in the same file.
 * */
private sealed class Paper {

}

private class PaperA : Paper() {
    override fun equals(other: Any?): Boolean {
        return false
    }

    override fun hashCode(): Int {
        return 0
    }
}