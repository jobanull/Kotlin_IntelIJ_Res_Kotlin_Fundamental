package training.dataClass

import org.junit.Test

class Set {
    fun setTest() {
        // TODO 1
        // Buat set integer bernama integerSet yang berisi elemen 1, 2, 4, 2, 1, 5.
        val integerSet = setOf(1, 2, 4, 2, 1, 5)

        // TODO 2
        // Cetak integerSet untuk melihat hasilnya (set tidak mengizinkan elemen duplikat).
        println("INTEGER SET : $integerSet")

        // TODO 3
        // Buat dua set, setA dan setB, dan bandingkan apakah keduanya sama.
        val setA = setOf(1, 2, 4, 2, 1, 5)
        val setB = setOf(1, 2, 4, 5)

        // TODO 4
        // Periksa apakah setA dan setB sama dan cetak hasil perbandingan.
        println(setA == setB)

        // TODO 5
        // Periksa apakah angka 5 terdapat dalam setA dan cetak hasilnya.
        print(5 in setA)

        // TODO 6
        // Buat setC dan temukan union dan intersect antara setA dan setC.
        val setC = setOf(1, 5, 7)

        // TODO 7
        // Ambil union (gabungan) dari setA dan setC dan cetak hasilnya.
        val union = setA.union(setC)

        // TODO 8
        // Ambil intersect (irisan) antara setA dan setC dan cetak hasilnya.
        val intersect = setA.intersect(setC)

        println("UNION : $union")
        println("INTERSECT : $intersect")

        // TODO 9
        // Buat mutable set dan tambahkan serta hapus elemen.
        val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)

        // TODO 10
        // Tambahkan elemen 6 ke dalam mutableSet.
        mutableSet.add(6)

        // TODO 11
        // Hapus elemen 1 dari mutableSet.
        mutableSet.remove(1)
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