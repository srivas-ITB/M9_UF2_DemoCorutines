import kotlinx.coroutines.*

// Sense el runBlocking no podrem fer launch
fun main() = runBlocking {
    launch { printWorld() }
    print("Hello ") // Escriu Hello
}

// Sense el suspend no podrem fer delay
suspend fun printWorld() {
    delay(1000L) // es posa a dormir per 1 segon
    println("World!") // Escriu World! després de 1 segon
}