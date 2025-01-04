package training.controlFlow

import org.junit.Test
import printSpace

class Looping {
    fun loooping() {

        // TODO
        // Lengkapi variable ranges dengan nilai 1 sampai 1- dengan step 3
        var ranges = Int
        // TODO 2
        // iterasi variable ranges menggunakan for-loop dan cetak nilai setiap elemen.

        ranges.printSpace

        // TODO 3
        // iterasi variable ranges menggunakan for-loop dengan pasangan index dan nilai,
        // dan cetak nilai beserta indeksnya.

        ranges.printSpace

        // TODO 4
        // iterasi variable ranges menggunakan fungsi forEach dan cetak setiap nilai elemen.

        ranges.printSpace

        // TODO 5
        // iterasi variable ranges menggunakan fungsi forEachIndexed,
        // dan cetak indeks setiap elemen.

    }
}

class LoopingTest {
    private var looping = Looping()

    @Test
    fun loopingTest() {
        // TODO 6
        // Panggil fungsi loooping() dan verifikasi bahwa hasilnya sesuai
        // dengan ekspektasi.
    }
}
