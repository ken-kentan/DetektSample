import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.Dispatchers

fun main(args: Array<String>) {
    println("Hello World!")

    runBlocking {
        launch(Dispatchers.IO) { }
    }
}
