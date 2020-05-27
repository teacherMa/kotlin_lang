package chapter3_function

// top-level
var invokeCount = 0
// equals to "public static final"
private const val MAX_COUNT = 5;

fun main() {
    val num = arrayListOf(1, 2, 3, 4, 5)
    val pc = PrintCollection();
    println("basic use of origin version ${pc.collectionToString("[", "]", ",", num)}")
    println(
        "use name param  ${pc.collectionToString(
            prefix = "[", suffix = "]", divider = ",", collection = num
        )}"
    )
    println("use default param ${pc.paramWithDefaultValue(collection = num, divider = ",")}")
    // 如果不使用命名参数，则只能省略排在末尾的参数
    println("use default param ${pc.paramWithDefaultValue(num, "[", "]")}")
    println("use top level function ${topLevelFunction(collection = num)}")
    println("invoke $invokeCount times")
}

class PrintCollection {
    /**
     * origin version
     * */
    fun <T> collectionToString(
        prefix: String,
        suffix: String,
        divider: String,
        collection: Collection<T>
    ): String {
        invokeCount ++
        val result = StringBuilder()
        result.append(prefix)
        for ((index, genData) in collection.withIndex()) {
            result.append(genData)
            if (index < collection.size - 1) {
                result.append(divider)
            }
        }
        result.append(suffix)
        return result.toString()
    }

    /**
     * param with default value.
     * @see collectionToString
     * */
    fun <T> paramWithDefaultValue(
        collection: Collection<T>,
        prefix: String = " ",
        suffix: String = " ",
        divider: String = " "
    ): String {
        invokeCount ++
        val result = StringBuilder()
        result.append(prefix)
        for ((index, genData) in collection.withIndex()) {
            result.append(genData)
            if (index < collection.size - 1) {
                result.append(divider)
            }
        }
        result.append(suffix)
        return result.toString()
    }
}

/**
 * Top level function, like static method in Java.
 * @see PrintCollection.collectionToString
 * */
fun <T> topLevelFunction(
    collection: Collection<T>,
    prefix: String = " ",
    suffix: String = " ",
    divider: String = " "
): String {
    invokeCount ++;
    val result = StringBuilder()
    result.append(prefix)
    for ((index, genData) in collection.withIndex()) {
        result.append(genData)
        if (index < collection.size - 1) {
            result.append(divider)
        }
    }
    result.append(suffix)
    return result.toString()
}

