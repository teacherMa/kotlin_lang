package chapter2_basic

/**
 * Use if and when.
 * In kotlin, "if" and "when" as expression, not statement, which means they has value.
 * */
fun main() {
    println(getDescription(Color.BLUE))
    println(getDescriptionIf(Color.BLUE))
}

// when 可以用括号，也可以不用括号。用括号时，最后一行就是返回值。
fun getDescription(color: Color): String {
    return when (color) {
        Color.RED, Color.DARK_RED -> {
            "RED"
        }
        Color.GREEN -> "GREEN"
        Color.BLUE -> "BLUE"
        Color.YELLOW -> "YELLOW"
        Color.WHITE -> "WHITE"
        Color.BLACK -> "BLACK"
    }
}

// if 可以用括号，也可以不用括号。用括号时，最后一行就是返回值。
fun getDescriptionIf(color: Color): String {
    return if (color == Color.RED || color == Color.DARK_RED) {
        "RED"
    } else if (color == Color.GREEN) {
        "GREEN"
    } else if (color == Color.BLUE) {
        "BLUE"
    } else if (color == Color.YELLOW) {
        "YELLOW"
    } else if (color == Color.WHITE) {
        "WHITE"
    } else if (color == Color.BLACK) {
        "BLACK"
    } else
        "NONE"
}

enum class Color(private val red: Int, private val green: Int, private val blue: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0),
    WHITE(255, 255, 255),
    BLACK(0, 0, 0),
    DARK_RED(150, 0, 0);

    fun getNumber(): Int = red * 256 * 256 + green * 256 + blue

    // when 可以用来判断多种类型
    fun mixColor(color1: Color, color2: Color): Color {
        return when (setOf(color1, color2)) {
            setOf(
                BLUE,
                YELLOW
            ) -> WHITE
            else -> BLACK
        }
    }

    // when 的括号里可以没有表达式
    fun optimizedMix(color1: Color, color2: Color): Color {
        return when {
            (color1 == BLUE && color2 == YELLOW)
                    || (color1 == YELLOW && color2 == BLUE) -> WHITE
            else -> BLACK
        }
    }
}
