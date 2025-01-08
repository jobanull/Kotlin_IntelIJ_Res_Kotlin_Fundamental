package training.fundamental

import org.junit.Test


fun Int.printSpace(){
    println("=========================")
}

class Array {
    fun array() {
        // TODO 1
        // Buat array dengan elemen campuran (integer, string, boolean).
        val mixArray = 0

        // TODO 2
        // Buat array khusus dengan elemen bertipe integer.
        val intArray = 0

        // TODO 4
        // Buat array khusus dengan elemen bertipe double.
        val doubleArray = 0

        // TODO 5
        // Ubah elemen keempat dari `intArray` menjadi 80.

        // TODO 6
        // Cetak elemen-elemen dari intArray menggunakan `forEach` loop.

        // TODO 7
        10.printSpace()
        // Cetak elemen-elemen dari array campuran menggunakan `for` loop.

        // TODO 8
        10.printSpace()
        // Cetak elemen-elemen dari `intArray` dengan indeks menggunakan `for` loop.

        // TODO 9
        10.printSpace()
        // Cetak elemen-elemen dari `doubleArray` menggunakan `while` loop.
    }
}

class ArrayTest {
    val array = Array()
    @Test
    fun testArray() {
        array.array()
    }
}
