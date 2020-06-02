package chapter4_classandinterface

fun main() {
    AccountManager.login()
    println(AccountManager.isLogin)
    AccountManager.loginOut()
    println(AccountManager.isLogin)
}

object AccountManager {
    var isLogin: Boolean = false

    fun login() {
        isLogin = true
    }

    fun loginOut() {
        isLogin = false
    }
}