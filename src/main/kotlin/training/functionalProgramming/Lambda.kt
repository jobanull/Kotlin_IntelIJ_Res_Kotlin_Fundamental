package training.functionalProgramming

import org.junit.Test

class Lambda {

    // TODO 1
    // Implementasikan lambda pada message untuk mencetak "Hello From Lambda".
    val message = 0

    // TODO 2
    // Implementasikan lambda pada printMessage untuk mencetak pesan yang diterima sebagai parameter.
    val printMessage = 0

    // TODO 3
    // Implementasikan lambda pada messageLength untuk mencetak panjang dari string yang diberikan.
    val messageLength = 0

    // Lambda with Receiver
    fun lambdaWithReceiver(action: StringBuilder.() -> Unit): String {
        val stringBuilder = StringBuilder()
        // TODO 4
        // Panggil lambda `action` pada objek `stringBuilder` dan kembalikan string hasilnya.
        return stringBuilder.toString() // TODO 5
    }
}

class LambdaTest {
    private val lambda = Lambda()

    @Test
    fun lambdaTest() {
        // TODO 6
        // Panggil lambda `message` dan cetak hasilnya.
        lambda.message
        lambda.printMessage
        lambda.messageLength
        // TODO 9
        // Panggil fungsi `lambdaWithReceiver` untuk menggabungkan beberapa kata dan cetak hasilnya.
    }
}
