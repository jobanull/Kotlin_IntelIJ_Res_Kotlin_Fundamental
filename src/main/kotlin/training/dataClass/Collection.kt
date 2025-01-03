package training.dataClass

import org.junit.Test
import original.dataClass.Collection

class Collection {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    var evenList = emptyList<Number>()
    var notEvenList = emptyList<Number>()
    var multipliedBy5 = emptyList<Number>()

    fun collectionsOperations() {
        // TODO 1
        // Filter numberList untuk mendapatkan hanya angka genap dan simpan dalam evenList.
        evenList = numberList.filter { it % 2 == 0 }

        // TODO 2
        // Filter numberList untuk mendapatkan angka yang tidak genap dan simpan dalam notEvenList.
        notEvenList = numberList.filterNot { it % 2 == 0 }

        // TODO 3
        // Map numberList dengan mengalikan setiap elemen dengan 5 dan simpan hasilnya dalam multipliedBy5.
        multipliedBy5 = numberList.map { it * 5 }

        // TODO 4
        // Hitung jumlah elemen dalam numberList dan cetak hasilnya.
        println("COUNT : ${numberList.count()}")

        // TODO 5
        // Hitung jumlah elemen dalam numberList yang habis dibagi 3 dan cetak hasilnya.
        println("MODULUS : ${numberList.count { it % 3 == 0 }}")

        // TODO 6
        // Cetak isi evenList yang berisi angka genap.
        println("EVEN LIST : $evenList")

        // TODO 7
        // Cetak isi notEvenList yang berisi angka yang tidak genap.
        println("NOT EVEN LIST : $notEvenList")

        // TODO 8
        // Cetak hasil perkalian elemen dalam numberList dengan 5.
        println("MUTIPLIED BY 5 : $multipliedBy5")

        // TODO 9
        // Temukan angka ganjil pertama dalam numberList dan cetak hasilnya.
        val firstOddNumber = numberList.find { it % 2 == 1 }

        // TODO 10
        // Temukan angka ganjil pertama dalam numberList atau null jika tidak ada dan cetak hasilnya.
        val firstOrNullNumber = numberList.firstOrNull { it % 2 == 1 }
        println("FIRST ODD NUMBER : $firstOddNumber")
        println("FIRST ODD OR NULL NUMBER : $firstOrNullNumber")

        // TODO 11
        // Temukan angka pertama yang lebih besar dari 10 dalam numberList dan cetak hasilnya.
        val moreThan10 = numberList.first { it > 10 }
        println("MORE THAN 10 : $moreThan10")

        // TODO 12
        // Hitung total semua angka dalam numberList dan cetak hasilnya.
        val total = numberList.sum()
        println("TOTAL : $total")

        // TODO 13
        // Urutkan karakter dalam list kotlinChar secara ascending dan cetak hasilnya.
        val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
        val ascendingSort = kotlinChar.sorted()
        println("ASCENDING SORT : $ascendingSort")

        // TODO 14
        // Urutkan karakter dalam list kotlinChar secara descending dan cetak hasilnya.
        val descendingSort = kotlinChar.sortedDescending()
        println("DESCENDING SORT : $descendingSort")
    }
}

class CollectionTest {
    val collection = Collection()

    @Test
    fun collectionTest() {
        // TODO 15
        // Panggil fungsi collectionsOperations untuk menjalankan operasi koleksi dan mencetak hasilnya.
        collection.collectionsOperations()
    }
}
