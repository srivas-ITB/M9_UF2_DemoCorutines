import kotlinx.coroutines.*

// Sense el runBlocking no podrem cridar a una suspend function
fun main() = runBlocking {
    printHelloWorld()
}

// Sense el suspend no podrem fer launch ni delay
suspend fun printHelloWorld()= coroutineScope {
    launch {
        delay(1000L) // es posa a dormir per 1 segon
        println("World!") // Escriu World! després d'1 segon
    }
    print("Hello ") // Escriu Hello
}

/***************************************************************************************************************
 * https://kotlinlang.org/docs/coroutines-basics.html#scope-builder
    Los constructores runBlocking y coroutineScope pueden parecer similares porque ambos
    esperan a que se completen su cuerpo y todos sus elementos secundarios.
    La principal diferencia es que el método runBlocking bloquea el hilo actual en espera,
    mientras que coroutineScope simplemente se suspende, liberando el hilo subyacente para otros usos.
    Debido a esa diferencia, runBlocking es una función regular y coroutineScope es una función de suspensión.
 ***************************************************************************************************************/