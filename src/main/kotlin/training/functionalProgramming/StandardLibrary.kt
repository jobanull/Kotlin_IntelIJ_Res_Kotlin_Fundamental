package training.functionalProgramming

import org.junit.Test

class StandardLibrary {
    fun kotlinStandardLibrary() {
        // TODO 1
        // Gunakan StringBuilder dengan apply untuk menambahkan "Hello " dan "Kotlin ".
        val buildString = 0

        // TODO 2
        // Cetak hasil buildString.
        println("BUILD STRING : $buildString")

        // TODO 3
        // Gunakan run untuk mengganti kata "Hello" menjadi "Kotlin" dalam string text dan format hasilnya.
        val text = "Hello"
        val result = 0

        // TODO 4
        // Cetak hasil run.
        println("RUN : $result")

        // TODO 5
        // Gunakan with untuk mencetak panjang dan isi dari message.
        val message = "Hello Kotlin!"
        val withResult = 0

        // TODO 6
        // Cetak hasil with.
        println("WITH : $withResult")

        // TODO 7
        // Gunakan with untuk mengambil karakter pertama dan terakhir dari message2.
        val message2 = "Hello Kotlin!"
        val withResult2 = 0

        // TODO 8
        // Cetak hasil withResult2.
        println("WITH RESULT : $withResult2")

        // TODO 9
        // Gunakan apply untuk membuat StringBuilder dan menambahkan "Hello " dan "Kotlin!".
        val message3 = 0

        // TODO 10
        // Cetak hasil message3.
        println("APPLY : $message3")

        // TODO 11
        // Gunakan let untuk memeriksa panjang string dan mencetak hasilnya, jika message5 tidak null.
        val message5: String? = null
        message5

        // TODO 12
        // Gunakan let untuk mencetak panjang string jika message5 tidak null, atau cetak "message is null" jika null.
        message5

        // TODO 13
        // Gunakan also untuk mencetak panjang dari text.
        val result4 = 0

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