package training.functionalProgramming

import org.junit.Test

// TODO 1
// Buat fungsi printInt untuk ekstensi Integer, lalu cetak valuenya.
fun Int.printInt(){
    println("Value $this")
}

// TODO 2
// Buat fungsi ekstensi Int plusThree yang mengembalikan nilai Int.
// Implementasikan fungsi tersebut agar menambahkan 3 pada nilai integer.
fun Int.plusThree() : Int{
    return this + 3
}

// TODO 3
// Buat properti ekstensi slice pada Int yang mengembalikan nilai setengah dari integer.
fun Int.slice() : Int{
    return this / 2
}

class ExtensionTest {
    @Test
    fun setTest() {
        // TODO 4
        // Panggil fungsi printInt() pada nilai 10 dan cetak hasilnya.
        10.printInt()
        // TODO 5
        // Panggil fungsi plusThree() pada nilai 20 dan cetak hasilnya.
//        println(20.plusThree())
        // TODO 6
        // Panggil properti slice pada nilai 30 dan cetak hasilnya.
//        println(30.slice())
    }
}
