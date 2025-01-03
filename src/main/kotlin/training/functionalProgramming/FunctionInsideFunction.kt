package training.functionalProgramming

import org.junit.Test

class FunctionInsideFunction {

    // Example 1
    fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
        // TODO 1
        // Periksa apakah valueA, valueB, dan valueC lebih besar dari 0. Jika tidak, lemparkan IllegalArgumentException.
        return 0 // TODO 2
    }

    // Example 2
    fun sum2(valueA: Int, valueB: Int, valueC: Int): Int {
        // TODO 3
        // Buat fungsi `validateNumber` di dalam `sum2` untuk memeriksa apakah nilai lebih besar dari 0.
        // TODO 4
        // Panggil fungsi `validateNumber` untuk valueA, valueB, dan valueC sebelum menjumlahkan.
        return 0 // TODO 5
    }

    // Example 3
    fun sum3(valueA: Int, valueB: Int, valueC: Int): Int {
        // TODO 6
        // Buat ekstensi fungsi untuk tipe data `Int` yang memeriksa apakah nilai lebih besar dari 0.
        // TODO 7
        // Panggil ekstensi fungsi `validateNumber` untuk valueA, valueB, dan valueC.
        return 0 // TODO 8
    }
}

class FunctionInsideFunctionTest {
    private val fifTest = FunctionInsideFunction()

    @Test
    fun fifTest() {
        // TODO 9
        // Panggil fungsi `sum` dengan parameter angka dan cetak hasilnya.
        // TODO 10
        // Panggil fungsi `sum2` dengan parameter angka dan cetak hasilnya.
        // TODO 11
        // Panggil fungsi `sum3` dengan parameter angka dan cetak hasilnya.
    }
}
