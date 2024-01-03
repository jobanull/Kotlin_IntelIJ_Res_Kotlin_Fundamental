package functionalProgramming

class Lambda {
    fun latihanLambda(){
        val message = { println("Hello From Lambda") }
        val printMessage = { message: String -> println(message) }
        val messageLength = { message: String -> message.length }
    }

    // Lambda with Receiver
    fun latihanLambdaWithReceiver(action: StringBuilder.() -> Unit): String {
        val stringBuilder = StringBuilder()
        stringBuilder.action()
        return stringBuilder.toString()
    }
}