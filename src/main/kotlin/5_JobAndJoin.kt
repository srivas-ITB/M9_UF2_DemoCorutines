import kotlinx.coroutines.*

fun main() = runBlocking {
    val job: Job = launch {printWorld5() }

    print("Hello ")
    job.join()      // Espera a que acabi el job
    println("Ara acabo jo!!!")
}

// Sense el suspend no podrem fer delay
suspend fun printWorld5() {
    delay(1000L) // es posa a dormir per 1 segon
    println("World!") // Escriu World! després de 1 segon
}
