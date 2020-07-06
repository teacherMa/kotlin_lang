package chapter8_higherolderfunction

fun main() {
    // The compiler automatically infers the type
    val autoType = { x: Int, y: Int -> println(x + y) }

    // Explicit specify the type
    // 观察(Int, Int) -> Unit，指定了函数最重要的参数类型与返回类型
    val explicitType: (Int, Int) -> Unit = { x: Int, y: Int -> println(x + y) }

    // 可以指定参数名字，这有利于IDE的自动代码补齐与阅读
    val explicitTypeWithName: (xi: Int, yi: Int) -> Unit = { xi: Int, yi: Int -> println(xi + yi) }

    autoType(1, 2)
    explicitType(2, 3)
    explicitTypeWithName(3, 4)

}