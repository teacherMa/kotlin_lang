package chapter4_classandinterface

fun main() {
    val pen = Pen()

    // pen.writeSecret()
}

/**
 * Top-level Function with private, you can use it in this file only.
 * */
private fun write() {

}

/**
 * Class default declared with public, you can use it anywhere.
 * */
public open class Pen {
    /**
     * Function default declared with public, you can use it anywhere.
     * */
    public fun write() {

    }

    /**
     * Function declared with private, you can use it in this class only.
     * */
    private fun writeSecret() {

    }

    /**
     * Function declared with protected, you can use it in this class and sub-class only.
     * If function was declared with "protected", it must been declared with "open" ,too.
     * */
    protected open fun writePenKind() {

    }

    /**
     * Function declared with internal, you can use it in a same module only.
     * "a same module" means the codes which compiled together
     * */
    internal fun writeAModule() {

    }
}

public class AmericanPen : Pen() {
    override fun writePenKind() {

    }
}