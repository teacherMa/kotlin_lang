package chapter3_function

class User(val id: Int = 0, val name: String = "", val address: String = "")

fun main() {
    saveUser(User(1, "ma", "LongYueYuan"))
    saveUserWithFunInFun(User())
    User().saveUserWithFunInFunAndFunExtend()
}

/**
 * Basic Version
 * */
fun saveUser(user: User) {
    when {
        user.id == 0 -> {
            throw IllegalArgumentException("Invalid ID")
        }
        user.name.isEmpty() -> {
            throw IllegalArgumentException("Invalid Name")
        }
        user.address.isEmpty() -> {
            throw IllegalArgumentException("Invalid Address")
        }
    }
    saveToDataBase(user)
}

/**
 * Add check fun
 * */
fun saveUserWithFunInFun(user: User) {
    fun check(user: User, value: String, name: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Invalid $name for ${user.id}")
        }
    }
    check(user, user.address, "address")
    check(user, user.name, "name")
    saveToDataBase(user)
}

fun User.saveUserWithFunInFunAndFunExtend() {
    fun check(value: String, name: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Invalid $name for $id")
        }
    }
    check(address, "address")
    check(name, "name")
    saveToDataBase(this)
}

fun saveToDataBase(user: User) {

}