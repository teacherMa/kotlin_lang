package chapter7_operatorandconvention

operator fun Point.inc(): Point = Point(this.x + 1, this.y + 1)

/**
 * I will show you how to do this, but
 * there is no point in doing this due to Point is In-mutable
 */
operator fun Point.minusAssign(point: Point) {
//    this.x -= point.x
//    this.y -= point.y
}

/**
 * 使用[]访问的时候，get方法会被调用。
 * 使用[]赋值的时候，set方法会被调用。由于Point设计为不可变的，所以不展示如何重载set方法了。
 */
operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Index is $index, array size is 2")
    }
}

/**
 * Overload "in" operator
 * If a rectangle that enclosed by point and coordinate axes is cover by another rectangle that enclosed by another point and coordinate axe,
 * we can say that point is in another
 * */
operator fun Point.contains(point: Point): Boolean {
    // No impl yet
    return false
}