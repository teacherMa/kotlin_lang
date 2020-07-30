package chapter9_generic

fun main() {
    testOpen()
    testEat()
    testOutBox()
    testOutBox2()
}

open class Food

open class Fruit : Food()

open class Apple : Fruit()

class AmericanApple : Apple()

class FoodBox<T : Food> {
    fun removeFirst() {

    }
}

open class OutFoodBox<out T> {
    fun removeFirst() {

    }
}

class OutFoodBox2<T> : OutFoodBox<T>() {

}

fun openBox(all: FoodBox<Food>) {
    all.removeFirst()
}

fun eatList(all: MutableList<Food>) {
    all.removeAt(0)
}

fun openOutBox(all: OutFoodBox<Food>) {
    all.removeFirst()
}

fun testOpen() {
    openBox(FoodBox<Food>())
    // Compile error
//    openBox(FoodBox<Fruit>())
}

fun testEat() {
    // List<out E>, and MutableList<E> :List<E>(), so MutableList is actually MutableList<out E>
    eatList(mutableListOf(Food()))
    eatList(mutableListOf(Fruit()))
}

fun testOutBox() {
    openOutBox(OutFoodBox<Food>())
    openOutBox(OutFoodBox<Fruit>())
}

fun testOutBox2() {
    openOutBox(OutFoodBox2<Food>())
    openOutBox(OutFoodBox2<Fruit>())
}