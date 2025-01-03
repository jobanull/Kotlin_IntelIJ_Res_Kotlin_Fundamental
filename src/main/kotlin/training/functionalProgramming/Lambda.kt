package training.functionalProgramming

import org.junit.Test

class Lambda {

    val message = {
        // TODO 1
        // Implementasikan lambda untuk mencetak "Hello From Lambda".
    }

    val printMessage = { message: String ->
        // TODO 2
        // Implementasikan lambda untuk mencetak pesan yang diterima sebagai parameter.
    }

    val messageLength = { message: String ->
        // TODO 3
        // Implementasikan lambda untuk mencetak panjang dari string yang diberikan.
    }

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
        // TODO 7
        // Panggil lambda `printMessage` dengan parameter "Jajang" dan cetak hasilnya.
        // TODO 8
        // Panggil lambda `messageLength` dengan parameter "Asep" dan cetak hasilnya.

        // TODO 9
        // Panggil fungsi `lambdaWithReceiver` untuk menggabungkan beberapa kata dan cetak hasilnya.
    }
}
