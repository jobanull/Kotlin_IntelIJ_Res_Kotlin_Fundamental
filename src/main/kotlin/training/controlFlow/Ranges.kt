package training.controlFlow

import org.junit.Test
import printSpace

class Ranges {
    fun ranges(value: Int) {
        // TODO 1
        // Buat sebuah variable range1 dari 1 hingga value dengan step 2,
        // iterasi menggunakan forEach, dan cetak setiap nilai elemen.
        // Setelah iterasi selesai, cetak nilai step dari range tersebut.

        value.printSpace

        // TODO 2
        // Buat variable range2 menggunakan downTo dari value hingga 1.
        // Periksa apakah nilai 7 ada dalam range tersebut, dan jika ada,
        // cetak "Value 7 Available".

    }
}

class RangesTest {
    private val ranges = Ranges()

    @Test
    fun rangeTest() {
        // TODO 4
        // Panggil fungsi ranges() dengan parameter tertentu,
        // dan pastikan outputnya sesuai dengan ekspektasi.
    }
}
