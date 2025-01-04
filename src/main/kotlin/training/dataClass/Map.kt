package training.dataClass

import org.junit.Test

class Map {
    fun mapTest() {
        // TODO 1
        // Buat map bernama capital yang berisi pasangan key-value kota-negara, dengan beberapa nama kota sebagai key dan negara sebagai value.
        val capital = 0

        // TODO 2
        // Akses dan cetak value dari key "Jakarta" menggunakan indeksasi map.
        println(capital)

        // TODO 3
        // Akses dan cetak value dari key "Jakarta" menggunakan fungsi getValue().
        println(capital)

        // TODO 4
        // Ambil dan cetak semua key dari map capital.
        val mapKeys = 0
        println(mapKeys)

        // TODO 5
        // Ambil dan cetak semua value dari map capital.
        val mapValues = 0
        println(mapValues)

        // TODO 6
        // Ubah map capital menjadi mutable dan simpan dalam mutableCapital.
        val mutableCapital = 0

        // TODO 7
        // Tambahkan pasangan key-value untuk Amsterdam dan Netherlands ke dalam mutableCapital.
        mutableCapital

        // TODO 8
        // Gunakan fungsi put() untuk menambahkan pasangan key-value untuk Berlin dan Germany.
        mutableCapital

        // TODO 9
        // Akses dan cetak value dari key "Amsterdam" di mutableCapital.
        println(mutableCapital)

        // TODO 10
        // Akses dan cetak semua keys dari mutableCapital.
        println(mutableCapital)

        // TODO 11
        // Akses dan cetak value dari key "Amsterdam" di mutableCapital menggunakan getValue().
        println(mutableCapital)
    }
}

class MapTest {
    private val map = Map()

    @Test
    fun mapTest() {
        // TODO 12
        // Panggil fungsi mapTest() untuk menjalankan semua operasi pada map dan mencetak hasilnya.
        map.mapTest()
    }
}
