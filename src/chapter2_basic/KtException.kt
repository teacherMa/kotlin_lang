package chapter2_basic

import java.io.IOException

/**
 * Kotlin's Exception system work some like Java's Exception system.
 * But there no Check-Exception and Unchecked-Exception, and you don't need to declare what the Exception that
 * the function would throw. So, you won't be force to try-catch code block.
 *
 * "try-catch" is a expression, just like "if" and "when". If there are more than one line code in the "try" block,
 * then last expression's  value in "try" block will be the return value. If exception happened, then last expression's
 * value in "catch" block will be the return value
 * */
fun main() {
    val th = ThrowException()
    try {
        th.checkException()
    } catch (e: Exception) {
        throw e
    } finally {
    }
    th.uncheckException()
}

class ThrowException {
    fun checkException() {
        throw IOException("123")
    }

    fun uncheckException() {
        throw NullPointerException("234")
    }

    fun getAValue(): Int {
        return try {
            11
        } catch (e: Exception) {
            return 1
        }
    }
}