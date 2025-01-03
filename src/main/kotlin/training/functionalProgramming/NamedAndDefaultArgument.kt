package training.functionalProgramming

import org.junit.Test

class NamedAndDefaultArgument {
    fun getFullName(first: String, middle: String, last: String): String {
        // TODO 1
        // Gabungkan nilai `first`, `middle`, dan `last` untuk mengembalikan nama lengkap.
        return "" // TODO 2
    }

    fun getFullName2(
        first: String = "Kotlin",
        middle: String = " is ",
        last: String = "Awesome"): String {
        // TODO 3
        // Gabungkan nilai `first`, `middle`, dan `last` (dengan nilai default) untuk mengembalikan nama lengkap.
        return "" // TODO 4
    }
}

class NamedAndDefaultArgumentTest {
    private val namedAndDefaultArgument = NamedAndDefaultArgument()

    @Test
    fun namedAndDefaultArgumentTest() {
        // TODO 5
        // Panggil `getFullName` dengan tiga parameter dan cetak hasilnya.
        // TODO 6
        // Panggil `getFullName2` dengan tiga parameter dan cetak hasilnya.
    }
}