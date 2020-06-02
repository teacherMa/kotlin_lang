package chapter4_classandinterface

fun main() {
    val cs = CountingSet<Int>()
    cs.addAll(listOf(1, 2, 3, 4, 5))
    print(cs.count)
}

/**
 * Only interface can be delegate to.
 */
class CountingSet<T>(private val inner: MutableCollection<T> = HashSet<T>()) : MutableCollection<T> by inner {
    var count: Int = 0

    override fun add(element: T): Boolean {
        count++
        return inner.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        count += elements.size
        return inner.addAll(elements)
    }
}
