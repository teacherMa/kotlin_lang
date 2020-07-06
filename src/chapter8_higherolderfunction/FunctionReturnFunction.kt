package chapter8_higherolderfunction

fun main() {

}

/**
 * Function that return a function sounds like very useful
 */
fun generateSumFunction(): (Int, Int) -> Int = { i, i2 -> i + i2 }