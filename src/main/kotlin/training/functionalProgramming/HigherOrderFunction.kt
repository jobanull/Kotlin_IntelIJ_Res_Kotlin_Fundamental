package training.functionalProgramming

import org.junit.Test

class HigherOrderFunction {
    // TODO 1
    // Buat sebuah properti bertipe lambda dengan nama sum.
    // Fungsi lambda ini harus menerima satu parameter bertipe Int
    // dan mengembalikan nilai hasil penjumlahan parameter dengan dirinya sendiri.

    // TODO 2
    // Buat sebuah fungsi bernama higherOrderFun.
    // Fungsi ini harus menerima dua parameter:
    // - value: sebuah nilai bertipe Int.
    // - sum: sebuah fungsi lambda yang menerima Int dan mengembalikan Int.
    // Implementasikan fungsi untuk memanggil lambda `sum` dengan parameter `value`
    // dan cetak hasilnya menggunakan println.

    // TODO 3
    // Buat sebuah fungsi inline bernama printResult.
    // Fungsi ini menerima dua parameter:
    // - value: sebuah nilai bertipe Int.
    // - sum: sebuah fungsi lambda yang menerima Int dan mengembalikan Int.
    // Implementasikan fungsi untuk memanggil lambda `sum` dengan parameter `value`
    // dan cetak hasilnya menggunakan println.

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