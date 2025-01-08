package training.fundamental

import org.junit.Test


fun Int.printSpace(){
    println("=========================")
}

class Array {
    fun array() {
        // TODO 1
        // Buat array dengan elemen campuran (integer, string, boolean).
        val mixArray = arrayOf(1,"Joban", false,3)

        // TODO 2
        // Buat array khusus dengan elemen bertipe integer.
        val intArray = intArrayOf(1,2,3,2,4)

        // TODO 4
        // Buat array khusus dengan elemen bertipe double.
        val doubleArray = doubleArrayOf(0.1, 0.2)

        // TODO 5
        // Ubah elemen keempat dari `intArray` menjadi 80.
        intArray[4] = 80
        // TODO 6
        // Cetak elemen-elemen dari intArray menggunakan `forEach` loop.
        intArray.forEach { println(it) }
        // TODO 7
        10.printSpace()
        // Cetak elemen-elemen dari array campuran menggunakan `for` loop.

        // TODO 8
        10.printSpace()
        // Cetak elemen-elemen dari `intArray` dengan indeks menggunakan `for` loop.
        for((i, e) in intArray.withIndex()){
            println("Index $i, Element $e")
        }
        // TODO 9
        10.printSpace()
        // Cetak elemen-elemen dari `doubleArray` menggunakan `while` loop.
        var index = 0
        while (index < doubleArray.size){
            println(doubleArray[index])
            index++
        }
    }
}

class ArrayTest {
    val array = Array()
    @Test
    fun testArray() {
        array.array()
    }
}
