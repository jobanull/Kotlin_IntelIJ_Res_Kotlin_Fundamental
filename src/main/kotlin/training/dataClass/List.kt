package training.dataClass

import org.junit.Test
import printSpace

class List {
    // TODO 1
    // lengkapi variable jadi emptylistof sesuai nama variable

    var numberList = 0
    var charList = 0
    var anyList = 0
    var mutableList = 0

    fun list() {
        // TODO 1
        // Inisialisasi numberList dengan list berisi angka 1 hingga 5.
        numberList = 0

        // TODO 2
        // Inisialisasi charList dengan list berisi karakter 'a', 'b', 'c'.
        charList = 0

        // TODO 3
        // Inisialisasi anyList dengan list yang berisi elemen berbeda tipe: Char, String, Int, dan Boolean.
        anyList = 0

        // TODO 4
        // Inisialisasi mutableList dengan list yang berisi elemen berbeda tipe.
        mutableList = 0

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
        mutableList

        // TODO 9
        // Tambahkan elemen "love" pada index 1 di mutableList.
        mutableList

        // TODO 10
        // Ubah elemen pada index 3 di mutableList menjadi false.
        mutableList

        // TODO 11
        // Hapus elemen pada index 0 di mutableList.
        mutableList

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