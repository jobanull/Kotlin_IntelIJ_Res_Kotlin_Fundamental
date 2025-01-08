package training.controlFlow

import org.junit.Test
import printSpace

class BreakAndContinue {
    fun breakAndContinue() {
        val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

        // TODO 1
        // Iterasi melalui listOfInt, lewati elemen yang nilainya null menggunakan continue
        // dan tampilkan elemen lainnya.

        listOfInt.printSpace

        // TODO 2
        // Iterasi melalui listOfInt, hentikan iterasi ketika bertemu elemen yang nilainya null
        // menggunakan break, dan tampilkan elemen sebelum elemen null.

        listOfInt.printSpace

    }
}

class BreakAndContinueTest {
    val breakAndContinue = BreakAndContinue()

    @Test
    fun breakAndContinueTest() {
        // TODO 4
        // Panggil fungsi breakAndContinue() dan verifikasi bahwa hasilnya sesuai
        // dengan ekspektasi.
    }
}
