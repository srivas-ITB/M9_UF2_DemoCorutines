import kotlinx.coroutines.*

fun main() = runBlocking {
    repeat(100_000) { // launch a lot of coroutines
        launch {
            delay(2000L)
            print(".")
        }
    }
}

fun main2() {
    repeat(100_000) {
        Thread {
            Thread.sleep(2000L)
            print(".")
        }.start()
    }
}