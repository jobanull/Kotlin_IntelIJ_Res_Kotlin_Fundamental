package training.functionalProgramming

import org.junit.Test

class HigherOrderFunction {
    // Higher-Order Function
    var sum: (Int) -> Int = { value ->
        // TODO 1
        // Implementasikan fungsi yang menjumlahkan nilai dengan dirinya sendiri.
        value + value // TODO 2
    }

    fun higherOrderFun(value: Int, sum: (Int) -> Int) {
        // TODO 3
        // Panggil fungsi `sum` dengan parameter `value` dan cetak hasilnya.
    }

    inline fun printResult(value: Int, sum: (Int) -> Int) {
        // TODO 4
        // Panggil fungsi `sum` dengan parameter `value` dan cetak hasilnya.
    }
}

class HigherOrderFunctionTest {
    private val higherOrderFunction = HigherOrderFunction()

    @Test
    fun higherOrderFunctionTest() {
        // TODO 5
        // Panggil fungsi `printResult` dengan parameter 10 dan `sum`.
        // TODO 6
        // Panggil fungsi `higherOrderFun` dengan parameter 10 dan `sum`.
    }
}