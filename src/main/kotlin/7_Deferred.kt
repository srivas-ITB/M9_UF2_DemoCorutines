import kotlinx.coroutines.*

fun main() = runBlocking {
    val deferred: Deferred<String> = async { printWorld7() }

    print("Hello ")
    println(deferred.await())
}

// Sense el suspend no podrem fer delay
suspend fun printWorld7():String {
    delay(1000L) // es posa a dormir per 1 segon
    return("World!") // Retorna World! després de 1 segon
}