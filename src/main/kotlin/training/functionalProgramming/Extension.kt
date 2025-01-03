package training.functionalProgramming

import org.junit.Test


fun Int.printInt() {
    // TODO 1
    // Implementasikan fungsi printInt() untuk mencetak "value $this".
}

fun Int.plusThree(): Int {
    // TODO 2
    // Implementasikan fungsi plusThree() yang menambahkan 3 pada nilai integer.
    return 0
}

val Int.slice: Int
    get() = this / 2 // TODO 3
// Implementasikan properti slice untuk membagi nilai integer dengan 2.


class ExtensionTest {
    @Test
    fun setTest() {
        // TODO 4
        // Panggil printInt() pada nilai 10 dan cetak hasilnya.

        // TODO 5
        // Panggil plusThree() pada nilai 20 dan cetak hasilnya.

        // TODO 6
        // Panggil properti slice pada nilai 30 dan cetak hasilnya.
    }
}