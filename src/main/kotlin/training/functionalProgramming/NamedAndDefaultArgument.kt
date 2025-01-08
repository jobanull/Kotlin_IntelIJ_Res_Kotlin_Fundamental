package training.functionalProgramming

import org.junit.Test

class NamedAndDefaultArgument {
    // TODO 1
    // Buat fun getFullName2 berisi 3 paramter, dan kembalikan string
    // Gabungkan nilai `first`, `middle`, dan `last` untuk mengembalikan nama lengkap.

    // TODO 3
    // Buat fun getFullName2 berisi 3 paramter dan default namenya nama lengkap, dan kembalikan string
    // Gabungkan nilai `first`, `middle`, dan `last` (dengan nilai default) untuk mengembalikan nama lengkap.

}

class NamedAndDefaultArgumentTest {
    private val namedAndDefaultArgument = NamedAndDefaultArgument()

    @Test
    fun namedAndDefaultArgumentTest() {
        // TODO 5
        // Panggil `getFullName` dengan tiga parameter dan cetak hasilnya.
        val result1 = namedAndDefaultArgument
        println(result1)
        // TODO 6
        // Panggil `getFullName2` dengan tiga parameter dan cetak hasilnya.
        val result2 = namedAndDefaultArgument
        println(result2)
    }
}