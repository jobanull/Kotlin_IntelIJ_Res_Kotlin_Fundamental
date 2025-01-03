package training.functionalProgramming

import org.junit.Test

class StandardLibrary {
    fun kotlinStandardLibrary() {
        // TODO 1
        // Gunakan StringBuilder dengan apply untuk menambahkan "Hello " dan "Kotlin ".
        val buildString = StringBuilder().apply {
            append("Hello ")
            append("Kotlin ")
        }

        // TODO 2
        // Cetak hasil buildString.
        println("BUILD STRING : $buildString")

        // TODO 3
        // Gunakan run untuk mengganti kata "Hello" menjadi "Kotlin" dalam string text dan format hasilnya.
        val text = "Hello"
        val result = text.run {
            val from = this
            val to = this.replace("Hello", "Kotlin")
            "replace text from $from to $to"
        }

        // TODO 4
        // Cetak hasil run.
        println("RUN : $result")

        // TODO 5
        // Gunakan with untuk mencetak panjang dan isi dari message.
        val message = "Hello Kotlin!"
        val withResult = with(message) {
            println("value is $this")
            println("with length ${this.length}")
        }

        // TODO 6
        // Cetak hasil with.
        println("WITH : $withResult")

        // TODO 7
        // Gunakan with untuk mengambil karakter pertama dan terakhir dari message2.
        val message2 = "Hello Kotlin!"
        val withResult2 = with(message2) {
            "First character is ${this[0]}" +
                    " and last character is ${this[this.length - 1]}"
        }

        // TODO 8
        // Cetak hasil withResult2.
        println("WITH RESULT : $withResult2")

        // TODO 9
        // Gunakan apply untuk membuat StringBuilder dan menambahkan "Hello " dan "Kotlin!".
        val message3 = StringBuilder().apply {
            append("Hello ")
            append("Kotlin!")
        }

        // TODO 10
        // Cetak hasil message3.
        println("APPLY : $message3")

        // TODO 11
        // Gunakan let untuk memeriksa panjang string dan mencetak hasilnya, jika message5 tidak null.
        val message5: String? = null
        message5?.let {
            val length = it.length * 2
            val text = "text length $length"
            println(text)
        }

        // TODO 12
        // Gunakan let untuk mencetak panjang string jika message5 tidak null, atau cetak "message is null" jika null.
        message5?.let {
            val length = it.length * 2
            val text = "text length $length"
            println(text)
        } ?: run {
            val text = "message is null"
            println(text)
        }

        // TODO 13
        // Gunakan also untuk mencetak panjang dari text.
        val result4 = text.also {
            println("value length -> ${it.length}")
        }

        // TODO 14
        // Cetak hasil also.
        println("ALSO : $result4")
    }
}

class StandardLibraryTest {
    private val standardLibrary = StandardLibrary()

    @Test
    fun standardLibraryTest() {
        // TODO 15
        // Panggil fungsi kotlinStandardLibrary untuk menjalankan semua operasi dan mencetak hasilnya.
        standardLibrary.kotlinStandardLibrary()
    }
}