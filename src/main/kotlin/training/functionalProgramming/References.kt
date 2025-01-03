package training.functionalProgramming

import org.junit.Test

class MemberReferences {
    val sums: (Int, Int) -> Int = ::count
    private fun count(valueA: Int, valueB: Int): Int {
        // TODO 1
        // Implementasikan fungsi `count` untuk menjumlahkan valueA dan valueB.
        return 0 // TODO 2
    }
}

class FunctionReferences {
    private fun isEvenNumber(number: Int) = number % 2 == 0

    fun show() {
        val numbers = 1.rangeTo(10)
        // TODO 3
        // Gunakan function reference untuk memfilter angka genap dari range 1 hingga 10.
        val evenNumber = numbers.filter(::isEvenNumber) // TODO 4
        println(evenNumber)
    }
}

class PropertyReferences {
    private var message = "Kotlin"

    fun show() {
        // TODO 5
        // Cetak nama properti `message` menggunakan `::message.name`.
        // TODO 6
        // Cetak nilai properti `message` menggunakan `::message.get()`.

        ::message.set("Kotlin Academy")

        // TODO 7
        // Cetak nilai baru dari properti `message` menggunakan `::message.get()`.
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