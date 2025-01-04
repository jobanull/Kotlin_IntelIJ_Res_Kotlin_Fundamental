package training.dataClass

import org.junit.Test

class Set {
    fun setTest() {
        // TODO 1
        // Buat set integer bernama integerSet yang berisi elemen 1, 2, 4, 2, 1, 5.
        val integerSet = 0

        // TODO 2
        // Cetak integerSet untuk melihat hasilnya (set tidak mengizinkan elemen duplikat).
        println("INTEGER SET : $")

        // TODO 3
        // Buat dua set, setA dan setB, dan bandingkan apakah keduanya sama.
        val setA = setOf(1, 2, 4, 2, 1, 5)
        val setB = setOf(1, 2, 4, 5)

        // TODO 4
        // Periksa apakah setA dan setB sama dan cetak hasil perbandingan.
        println("")

        // TODO 5
        // Periksa apakah angka 5 terdapat dalam setA dan cetak hasilnya.
        print("")

        // TODO 6
        // Buat setC dan temukan union dan intersect antara setA dan setC.
        val setC = 0

        // TODO 7
        // Ambil union (gabungan) dari setA dan setC dan cetak hasilnya.
        val union = 0

        // TODO 8
        // Ambil intersect (irisan) antara setA dan setC dan cetak hasilnya.
        val intersect = 0

        println("UNION : $")
        println("INTERSECT : $")

        // TODO 9
        // Buat mutable set berisi elemen 1, 2, 4, 2, 1, 5.
        val mutableSet =0

        // TODO 10
        // Tambahkan elemen 6 ke dalam mutableSet.
        mutableSet

        // TODO 11
        // Hapus elemen 1 dari mutableSet.
        mutableSet
    }
}

class SetTest {
    private val set = Set()

    @Test
    fun setTest() {
        // TODO 12
        // Panggil fungsi setTest() untuk menjalankan operasi pada set dan mencetak hasilnya.
        set.setTest()
    }
}