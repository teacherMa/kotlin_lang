package chapter8_higherolderfunction

fun main() {
    transform { println("run lambda") }
    deliver { println("run lambda") }
}

inline fun transform(f: () -> Unit) {
    println("start run")
    f()
    println("end run")
}

fun deliver(f: () -> Unit) {
    transform(f)
}