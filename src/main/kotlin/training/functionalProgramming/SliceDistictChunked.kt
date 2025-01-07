package training.functionalProgramming

import org.junit.Test
import java.util.*


data class Item(val key: String, val value: Any)

class SliceDistinctChunked {
    fun sliceDistinctChunked() {
        // TODO 1
        // Buat sebuah list yang berisi angka dari 1 hingga 10.
        val total = 0

        // TODO 2
        // Ambil slice dari list total dari index 3 hingga 6.
        val slice = 0

        // TODO 3
        // Ambil slice dari list total dengan langkah 2 dari index 3 hingga 6.
        val slice2 = 0

        // TODO 4
        // Cetak hasil slice pertama dan kedua.
        println("SLICE : $slice")
        println("SLICE2 : $slice2")

        // TODO 5
        // Buat sebuah list yang berisi index tertentu.
        val index = listOf(2, 3, 5, 8)

        // TODO 6
        // Ambil slice dari list total1 berdasarkan index yang telah ditentukan dan masuka dalam slice3.
        val total1 = 0
        val slice3 = 0

        // TODO 7
        // Cetak hasil slice3.
        println("SLICE3 : $slice3")

        // TODO 8
        // Buat list distinct dari list total.
        val distinct = 0

        // TODO 9
        // Cetak hasil distinct.
        println("DISTINCT : $distinct")

        // TODO 10
        // Buat list items yang berisi objek Item dengan key yang sama dan value yang berbeda.
        // isi itemnya buat jadi ikhdanul widad joban
        val items = 0

        // TODO 11
        // Ambil distinct berdasarkan key pada list items dan cetak hasilnya.
        val distinctItems = 0

        // TODO 12
        // Buat list text dan ambil distinct berdasarkan panjang string dan masukan dalam distinct1.
        val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
        val distinct1 = 0

        // TODO 13
        // Cetak hasil distinct berdasarkan panjang string.
        println("DISTINCT1 : $distinct1")

        // TODO 14
        // Ambil chunked string dari "QWERTY" dengan ukuran 3, dan ubah setiap bagian menjadi huruf kecil, masukan dalam chunkedTransform.
        val word = "QWERTY"
        val chunkedTransform = 0

        // TODO 15
        // Cetak hasil chunked.
        println("CHUNKED : $chunkedTransform")
    }
}

class SliceDistinctChunkedTest {
    private val sliceDistinctChunked = SliceDistinctChunked()

    @Test
    fun sliceDistinctChunkedTest() {
        // TODO 16
        // Panggil fungsi sliceDistinctChunked untuk melakukan operasi dan cetak hasilnya.
        sliceDistinctChunked.sliceDistinctChunked()
    }
}
