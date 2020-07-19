package advance.concurrent

import kotlinx.coroutines.*

class LockAndUnLock {
    fun startACoroutines() {
        GlobalScope.launch { // 在后台启动新的协程, 然后继续执行当前程序
            delay(1000L) // 非阻塞, 等待 1 秒 (默认的时间单位是毫秒)
            println("World!") // 等待完成后打印信息
        }
        println("Hello,") // 当协程在后台等待时, 主线程继续执行
        Thread.sleep(2000L) // 阻塞主线程 2 秒, 保证 JVM 继续存在
    }

    fun blockedBlock() {
        GlobalScope.launch {
            delay(1000L)
            println("World!")
        }
        println("Hello,")
        runBlocking {
            delay(1000L)
        }
    }
}
