package training.fundamental

import org.junit.Test

class Nullable {
    fun nullable(name: String) {
        // TODO 1
        // Periksa apakah parameter `name` tidak `null` dan tampilkan nilai `name`.

        // TODO 2
        // coba akses panjangnya loc dengan safe call.
        val loc = String

        // TODO 3
        // Gunakan elvis operator (`?:`) untuk memberikan nilai default jika `text` null.
        val text = String
        val textLength = String

        println(textLength)

        // TODO 4
        // Gunakan not-null assertion (`!!`) untuk memaksa akses panjang `testing`.
        val testing = String
    }
}

// Nullable Receiver
val Int?.slice2: Int
    get() =
    // TODO 5
        // Tambahkan logika untuk membagi `this` dengan 2 jika tidak null, atau kembalikan 0.
        0

class NullableTest {
    val nullableTest = Nullable()

    @Test
    fun nullableTest() {
        // TODO 6
        // Panggil fungsi `nullable` dengan parameter yang sesuai untuk menguji hasil.
        nullableTest.nullable("Joban")
    }
}