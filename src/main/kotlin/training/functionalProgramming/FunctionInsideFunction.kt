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
        val sum = fifTest.sum(1,2,3)
        val sum2 = fifTest.sum2(1,2,3)
        val sum3 = fifTest.sum3(1,2,3)
        println(sum)
        println(sum2)
        println(sum3)
    }
}
