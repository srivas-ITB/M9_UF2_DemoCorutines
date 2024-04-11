import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking {
    val channel : Channel<Int> = Channel()

    repeat(10) {
        launch {usarCanales(channel,it)  }
    }
    repeat(10) {
        println("El resultado de $it es ${channel.receive()}")
    }
}

suspend fun usarCanales( channel : Channel<Int>, x: Int ) {
    delay(1000L) // es posa a dormir per 1 segon
    channel.send(x*x)
}