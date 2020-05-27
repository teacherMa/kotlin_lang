package chapter3_function

const val TEST_STRING: String = "This . is - a Demo String"
const val TEST_PATH:String = "/Users/mabenteng/AndroidStudioProject/lbsmap/BaiduMap/build/outputs/apk/mcdullX32/debug/BaiduMap-mcdull-x32-debug.apk"

fun main() {
    getPathInfo()
    getPathInfoByRegex()
    printLogo()
    printLogo2()
    printDol()
}

fun singleSplit(divider: Char): List<String> {
    return TEST_STRING.split(divider)
}

fun regexSplit(divider: String) :List<String> {
    return TEST_STRING.split(divider.toRegex())
}

/**
 * The "*" is very important.If you didn't use "*" to split delimiters, a compile error will occur
 * */
fun multiSplit(vararg delimiters: Char): List<String> {
    return TEST_STRING.split(*delimiters)
}

fun getPathInfo() {
    val dir : String = TEST_PATH.substringBeforeLast("/")
    val fullName :String = TEST_PATH.substringAfterLast("/")
    val name :String = fullName.substringBeforeLast(".")
    val fileType :String = fullName.substringAfterLast(".")
    println("dir = $dir, fullName = $fullName, name = $name, fileType = $fileType")
}

/**
 * 被"""Str"""包住的字符串不需要做任何转义，并且保留字符串的格式。
 * */
fun getPathInfoByRegex() {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(TEST_PATH)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir = $directory, fileName = $filename, extension = $extension")
    }
}

/**
 * 注意观察|符号的作用
 * */
fun printLogo() {
    println("""  
                 a
                aaa
               aaaaa
    """.trimMargin())
}

fun printLogo2() {
    println("""a
        |aaa
        |aaaaa
    """.trimMargin())
}

fun printDol() {
    println("""${'$'}99""")
}