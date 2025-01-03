package training.functionalProgramming

import org.junit.Test
import java.util.*


data class Item(val key: String, val value: Any)

class SliceDistinctChunked {
    fun sliceDistinctChunked() {
        // TODO 1
        // Buat sebuah list yang berisi angka dari 1 hingga 10.
        val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        // TODO 2
        // Ambil slice dari list total dari index 3 hingga 6.
        val slice = total.slice(3..6)

        // TODO 3
        // Ambil slice dari list total dengan langkah 2 dari index 3 hingga 6.
        val slice2 = total.slice(3..6 step 2)

        // TODO 4
        // Cetak hasil slice pertama dan kedua.
        println("SLICE : $slice")
        println("SLICE2 : $slice2")

        // TODO 5
        // Buat sebuah list yang berisi index tertentu.
        val index = listOf(2, 3, 5, 8)

        // TODO 6
        // Ambil slice dari list total1 berdasarkan index yang telah ditentukan.
        val total1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val slice3 = total1.slice(index)

        // TODO 7
        // Cetak hasil slice3.
        println("SLICE3 : $slice3")

        // TODO 8
        // Buat list distinct dari list total.
        val distinct = total.distinct()

        // TODO 9
        // Cetak hasil distinct.
        println("DISTINCT : $distinct")

        // TODO 10
        // Buat list items yang berisi objek Item dengan key yang sama dan value yang berbeda.
        val items = listOf(
            Item("1", "Kotlin"),
            Item("2", "is"),
            Item("3", "Awesome"),
            Item("3", "as"),
            Item("3", "Programming"),
            Item("3", "Language")
        )

        // TODO 11
        // Ambil distinct berdasarkan key pada list items dan cetak hasilnya.
        val distinctItems = items.distinctBy { it.key }
        distinctItems.forEach {
            println("${it.key} with value ${it.value}")
        }

        // TODO 12
        // Buat list text dan ambil distinct berdasarkan panjang string.
        val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
        val distinct1 = text.distinctBy {
            it.length
        }

        // TODO 13
        // Cetak hasil distinct berdasarkan panjang string.
        println("DISTINCT1 : $distinct1")

        // TODO 14
        // Ambil chunked string dari "QWERTY" dengan ukuran 3, dan ubah setiap bagian menjadi huruf kecil.
        val word = "QWERTY"
        val chunkedTransform = word.chunked(3) {
            it.toString().lowercase(Locale.getDefault())
        }

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
