package training.functionalProgramming

import org.junit.Test

class MemberReferences {
    // TODO 1
    // Buat properti bernama sums yang menggunakan referensi fungsi (::) untuk mengakses fungsi count.
    // Fungsi lambda ini menerima dua parameter Int dan mengembalikan hasil penjumlahan keduanya.
    val sums: (Int, Int) -> Int = ::count

    // TODO 2
    // Buat fungsi privat bernama count yang menerima dua parameter Int (valueA dan valueB).
    // Fungsi ini mengembalikan hasil penjumlahan dari valueA dan valueB.
    private fun count(valueA: Int, valueB: Int): Int {
        return valueA + valueB
    }
}

class FunctionReferences {
    // TODO 3
    // Buat fungsi privat bernama isEvenNumber yang menerima satu parameter Int (number).
    // Fungsi ini mengembalikan true jika number adalah bilangan genap, false jika tidak.
    private fun isEvenNumber(number: Int) = number % 2 == 0

    // TODO 4
    // Buat fungsi bernama show.
    // Di dalam fungsi, gunakan referensi fungsi (::isEvenNumber) untuk memfilter bilangan genap
    // dari range angka 1 sampai 10 dan cetak hasilnya.
    fun show() {
        val numbers = 1.rangeTo(10)
        val evenNumber = numbers.filter(::isEvenNumber)
        println(evenNumber)
    }
}

class PropertyReferences {
    // TODO 5
    // Buat properti privat bernama message dengan nilai awal "Kotlin".
    private var message = "Kotlin"

    // TODO 6
    // Buat fungsi bernama show.
    // Di dalam fungsi, gunakan referensi properti (::message) untuk:
    // - Menampilkan nama properti.
    // - Mengambil dan mencetak nilai properti.
    // - Mengubah nilai properti menjadi "Kotlin Academy".
    // - Mengambil dan mencetak nilai properti yang telah diperbarui.
    fun show() {
        println(::message.name)
        println(::message.get())

        ::message.set("Kotlin Academy")

        println(::message.get())
    }
}

class ReferencesTest {
    private val memberReferences = MemberReferences()
    private val functionReferences = FunctionReferences()
    private val propertyReferences = PropertyReferences()

    // Function References

    @Test
    fun memberReferencesTest() {
        // TODO 8
        // Panggil `sums` dengan dua angka dan cetak hasilnya.
        // TODO 9
        // Panggil fungsi `show` dari `functionReferences` untuk menampilkan angka genap.
        // TODO 10
        // Panggil fungsi `show` dari `propertyReferences` untuk menampilkan informasi properti.
    }
}