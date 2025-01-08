package training.fundamental

import org.junit.Test

class Numbers {
    fun numbers() {
        // TODO 1
        // Deklarasikan variabel `long` dengan tipe `Long` dan beri nilai.
        val long = Long

        // TODO 2
        // Deklarasikan variabel `short` dengan tipe `Short` dan beri nilai.
        val short = Short

        // TODO 3
        // Deklarasikan variabel `byte` dengan tipe `Byte` dan beri nilai maksimum.
        val byte = Byte

        // TODO 4
        // Deklarasikan variabel `double` dengan tipe `Double` dan beri nilai.
        val double = Double

        // TODO 5
        // Deklarasikan variabel `float` dengan tipe `Float` dan beri nilai.
        val float = Float

        // TODO 6
        // Deklarasikan variabel `maxLong` untuk menyimpan nilai maksimum dari tipe `Long`.
        val maxLong = Long

        // TODO 7
        // Cetak nilai dari semua variabel yang telah dideklarasikan di atas.

        println(long)
        println(short)
        println(byte)
        println(double)
        println(float)
        println(maxLong)
    }
}

class NumbersTest {
    val numbers = Numbers()

    @Test
    fun numbersTest() {
        numbers.numbers()
    }
}
