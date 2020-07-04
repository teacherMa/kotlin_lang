package chapter6_typeandnullable

fun main() {
    val process = StringProcess()
    process.process("")
    process.process(null)
}

interface Process<T> {
    fun process(t: T): T
}

class NothingProcess : Process<Unit> {
    override fun process(t: Unit) {
        println("NothingProcess")
    }
}

class StringProcess : Process<String?> {
    override fun process(t: String?): String? {
        println("StringProcess")
        return null
    }
}