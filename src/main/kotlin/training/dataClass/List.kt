package training.dataClass

import org.junit.Test
class List {
    var numberList = emptyList<Int>()
    var charList = emptyList<Char>()
    var anyList = emptyList<Any>()
    var mutableList = mutableListOf<Any>()

    fun list() {
        // TODO 1
        // Inisialisasi numberList dengan list berisi angka 1 hingga 5.
        numberList = listOf(1, 2, 3, 4, 5)

        // TODO 2
        // Inisialisasi charList dengan list berisi karakter 'a', 'b', 'c'.
        charList = listOf('a', 'b', 'c')

        // TODO 3
        // Inisialisasi anyList dengan list yang berisi elemen berbeda tipe: Char, String, Int, dan Boolean.
        anyList = listOf('a', "Kotlin", 3, true)

        // TODO 4
        // Inisialisasi mutableList dengan list yang berisi elemen berbeda tipe.
        mutableList = mutableListOf('a', "Kotlin", 3, true)

        // TODO 5
        // Cetak numberList.
        println(numberList)

        // TODO 6
        // Cetak charList.
        println(charList)

        // TODO 7
        // Cetak anyList.
        println(anyList)

        // TODO 8
        // Tambahkan elemen 'd' ke dalam mutableList.
        mutableList.add('d')

        // TODO 9
        // Tambahkan elemen "love" pada index 1 di mutableList.
        mutableList.add(1, "love")

        // TODO 10
        // Ubah elemen pada index 3 di mutableList menjadi false.
        mutableList[3] = false

        // TODO 11
        // Hapus elemen pada index 0 di mutableList.
        mutableList.removeAt(0)

        // TODO 12
        // Cetak mutableList setelah perubahan.
        println(mutableList)
    }
}

class ListTest {
    private val list = List()

    @Test
    fun listTest() {
        // TODO 13
        // Panggil fungsi list() untuk menjalankan semua operasi pada list dan mencetak hasilnya.
        list.list()
    }
}