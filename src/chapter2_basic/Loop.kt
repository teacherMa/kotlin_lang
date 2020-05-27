package chapter2_basic

/**
 * In kotlin, while and do-while work as they are work in Java
 *
 * In Kotlin, ++ i and i ++ work as they are work in Java
 *
 * "from .. to" means [from, to].
 *
 * When use "xx in from .. to" in loop condition, I think "in" was some kind of iterator, and [from, to] must be iterable.
 * When use "xx in from .. to" in a judge condition, I think "in" was different with loop condition, and [from, to] must be comparable.
 * */
fun main() {
    printWhile(0)
    printDoWhile(0)
    printForLoop(100)
    printForLoopReverse(100)
    printMapUseFor()
}

fun printWhile(i: Int) {
    var index = 0;
    while (index++ < i) {
        println(index)
    }
}

fun printDoWhile(i: Int) {
    var index = 0;
    do {
        println(index)
    } while (index++ < i)
}

fun printForLoop(i: Int) {
    for (index in 90..i) {
        println(index)
    }
}

fun printForLoopReverse(i: Int) {
    for (index in i downTo 90 step 2) {
        println(index)
    }
}

fun printMapUseFor() {
    val resp = HashMap<Char, String>()

    for (c in 'A'..'D') {
        val binary = Integer.toBinaryString(c.toInt())
        resp[c] = binary
    }

    for ((char, string) in resp) {
        println("$char $string")
    }
}

fun isLetter(c: Char): Boolean = c in 'a'..'z' || c in 'A'..'Z'
fun isNotNum(c: Char): Boolean = c !in '0'..'9'