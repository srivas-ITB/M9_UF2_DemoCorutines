import kotlinx.coroutines.*

// Sense el runBlocking no podrem cridar a una suspend function
fun main() = runBlocking {
    printHelloWorld2()
    println("Ara acabo jo!!!")
}

suspend fun printHelloWorld2() = coroutineScope { // this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}


/*
 * Provar de cridar a printHelloWorld2 des de dins d'un launch
 * - Quina diferència hi ha de cridar-lo directament o des d'un launch?
 */