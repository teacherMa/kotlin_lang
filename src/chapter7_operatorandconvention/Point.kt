package chapter7_operatorandconvention

/**
 * 1.一般来说，如果重载了某个二元运算符，不要再定义该运算符的复合赋值版本。
 * 即，定义了+，就不要再定义+=。如果在代码中使用a+=b，可能会调用a=a.plus(b)，也可能调用的是a.plusAssign(b)
 *
 * 2.重载的运算符不支持交换顺序
 */
data class Point(val x: Int, val y: Int) {

    constructor() : this(0, 0)

    /**
     * plus means +
     */
    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)

    /**
     * times means *
     */
    operator fun <T : Number> times(t: T): Point {
        return when (t) {
            is Int -> {
                Point(x * t, y * t)
            }
            is Double -> {
                Point((x * t).toInt(), (y * t).toInt())
            }
            is Float -> {
                Point((x * t).toInt(), (y * t).toInt())
            }
            is Long -> {
                Point((x * t).toInt(), (y * t).toInt())
            }
            else -> {
                throw IllegalArgumentException("Type of ${t::class} is undefine")
            }
        }
    }

    /**
     * div means /
     */
    operator fun <T : Number> div(t: T): Point {
        return when (t) {
            is Int -> {
                Point(x / t, y / t)
            }
            is Double -> {
                Point((x / t).toInt(), (y / t).toInt())
            }
            is Float -> {
                Point((x / t).toInt(), (y / t).toInt())
            }
            is Long -> {
                Point((x / t).toInt(), (y / t).toInt())
            }
            else -> {
                throw IllegalArgumentException("Type of ${t::class} is undefine")
            }
        }
    }

    /**
     * mod means %
     * minus means -
     * xxxAssign means += -= *= /=
     */
    fun moreOperator() {

    }

    override fun toString(): String {
        return "X = $x, Y = $y"
    }

    /**
     * If you compare two objects with "==", It will be convert to invoke equals().
     * You can't reload "==" by extend function because of Any.kt has already define equals function, and function in Any.kt has highest priority
     */
    override fun equals(other: Any?): Boolean {
        return if (other !is Point) {
            false
        } else {
            other.x == x && other.y == y
        }
    }

    operator fun compareTo(p: Point?): Int {
        return if (p == null) {
            1
        } else {
            x * y - p.x * p.y
        }
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }

    /**
     * The compiler will automatic generate no more than 5 component-N function for data class
     */
    operator fun component3() {
        throw IllegalArgumentException("Point has only 2 elements")
    }
}