package original.functionalProgramming

import org.junit.Test

class Lambda {

    val message = { println("Hello From Lambda") }
    val printMessage = { message: String -> println(message) }
    val messageLength = { message: String -> println(message.length) }


    // Lambda with Receiver
    fun lambdaWithReceiver(action: StringBuilder.() -> Unit): String {
        val stringBuilder = StringBuilder()
        stringBuilder.action()
        return stringBuilder.toString()
    }
}

class LambdaTest{
    private val lambda = Lambda()
    @Test
    fun lambdaTest(){
        lambda.message()
        lambda.printMessage("Jajang")
        lambda.messageLength("Asep")

        val value = lambda.lambdaWithReceiver {
            append("Hello ")
            append("from ")
            append("lambda ")
        }

        println(value)


    }
}