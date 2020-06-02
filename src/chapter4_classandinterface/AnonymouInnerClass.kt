package chapter4_classandinterface

import java.awt.Window
import java.awt.event.WindowEvent
import java.awt.event.WindowFocusListener

fun main() {

}

fun addFocus(window: Window) {
    var changeCount = 0
    window.addWindowFocusListener(object : WindowFocusListener {
        override fun windowLostFocus(e: WindowEvent?) {
            changeCount++
        }

        override fun windowGainedFocus(e: WindowEvent?) {
            changeCount++
        }

    })

}