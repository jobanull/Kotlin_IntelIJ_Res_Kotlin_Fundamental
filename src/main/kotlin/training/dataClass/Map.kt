package training.dataClass

import org.junit.Test

class Map {
    fun mapTest() {
        // TODO 1
        // Buat map bernama capital yang berisi pasangan key-value, dengan beberapa nama kota sebagai key dan negara sebagai value.
        val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
        )

        // TODO 2
        // Akses dan cetak value dari key "Jakarta" menggunakan indeksasi map.
        println(capital["Jakarta"])

        // TODO 3
        // Akses dan cetak value dari key "Jakarta" menggunakan fungsi getValue().
        println(capital.getValue("Jakarta"))

        // TODO 4
        // Ambil dan cetak semua key dari map capital.
        val mapKeys = capital.keys

        // TODO 5
        // Ambil dan cetak semua value dari map capital.
        val mapValues = capital.values
        println(mapKeys)
        println(mapValues)

        // TODO 6
        // Ubah map capital menjadi mutable dan simpan dalam mutableCapital.
        val mutableCapital = capital.toMutableMap()

        // TODO 7
        // Tambahkan pasangan key-value untuk Amsterdam dan Netherlands ke dalam mutableCapital.
        mutableCapital["Amsterdam"] = "Netherlands"

        // TODO 8
        // Gunakan fungsi put() untuk menambahkan pasangan key-value untuk Berlin dan Germany.
        mutableCapital.put("Berlin", "Germany")

        // TODO 9
        // Akses dan cetak value dari key "Amsterdam" di mutableCapital.
        println(mutableCapital["Amsterdam"])

        // TODO 10
        // Akses dan cetak semua keys dari mutableCapital.
        println(mutableCapital.keys)

        // TODO 11
        // Akses dan cetak value dari key "Amsterdam" di mutableCapital menggunakan getValue().
        println(mutableCapital.getValue("Amsterdam"))
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
