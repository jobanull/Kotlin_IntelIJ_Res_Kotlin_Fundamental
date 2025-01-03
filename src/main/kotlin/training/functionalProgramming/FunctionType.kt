package training.functionalProgramming

import org.junit.Test

typealias Arithmetic = (Int, Int) -> Int

class FunctionType {
    val sum: Arithmetic = { valueA, valueB ->
        // TODO 1
        // Implementasikan operasi penjumlahan antara valueA dan valueB.
        valueA + valueB // TODO 2
    }

    val multiply: Arithmetic = { valueA, valueB ->
        // TODO 3
        // Implementasikan operasi perkalian antara valueA dan valueB.
        valueA * valueB // TODO 4
    }
}

class FunctionTypeTest {
    private val functionType = FunctionType()

    @Test
    fun functionTypeTest() {
        // TODO 5
        // Panggil fungsi `sum` dengan dua angka dan cetak hasilnya.
        // TODO 6
        // Panggil fungsi `multiply` dengan dua angka dan cetak hasilnya.
    }
}