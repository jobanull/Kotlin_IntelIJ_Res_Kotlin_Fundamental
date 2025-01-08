package training.controlFlow

import org.junit.Test
import printSpace

class WhileDoWhile {

    private var counter = 1

    fun wHile(value: Int) {
        // TODO 1
        // Buat variabel counter dengan nilai akhir dari parameter value.
        // Gunakan loop while untuk mencetak "ini While ke : <counter>"
        // hingga counter lebih kecil atau sama dengan counters. Jangan lupa
        // tambahkan nilai counter di setiap iterasi.

    }

    fun doWhile(value: Int) {
        // TODO 2
        // Buat variabel counters dengan nilai akhir dari parameter value.
        // Gunakan loop do-while untuk mencetak "ini doWhile ke : <counter>"
        // hingga counter lebih kecil atau sama dengan counters. Jangan lupa
        // tambahkan nilai counter di setiap iterasi.

    }
}

class WhileDoWhileTest {
    private val whileDoWhile = WhileDoWhile()

    @Test
    fun testWhile() {
        // TODO 3
        // Panggil fungsi wHile() dengan parameter tertentu,
        // dan pastikan outputnya sesuai dengan ekspektasi.
        whileDoWhile.printSpace
    }

    @Test
    fun testDoWhile() {
        // TODO 4
        // Panggil fungsi doWhile() dengan parameter tertentu,
        // dan pastikan outputnya sesuai dengan ekspektasi.
    }
}
