import kotlinx.coroutines.*

// Sense el runBlocking no podrem fer launch
fun main() = runBlocking {
    launch { // llença un nou fil dins el context de runBlocking
        delay(1000L) // es posa a dormir per 1 segon
        println("World!") // Escriu World! després de 1 segon
    }
    print("Hello ") // Escriu Hello
}