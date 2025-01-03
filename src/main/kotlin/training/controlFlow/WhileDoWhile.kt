package training.controlFlow

import org.junit.Test

class WhileDoWhile {
    fun wHile(value: Int) {
        // TODO 1
        // Buat variabel counter dengan nilai awal dari parameter value.
        // Gunakan loop while untuk mencetak "ini While ke : <counter>"
        // hingga counter lebih kecil atau sama dengan 7. Jangan lupa
        // tambahkan nilai counter di setiap iterasi.
    }

    fun doWhile(value: Int) {
        // TODO 2
        // Buat variabel counter dengan nilai awal dari parameter value.
        // Gunakan loop do-while untuk mencetak "ini doWhile ke : <counter>"
        // hingga counter lebih kecil atau sama dengan 7. Jangan lupa
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
    }

    @Test
    fun testDoWhile() {
        // TODO 4
        // Panggil fungsi doWhile() dengan parameter tertentu,
        // dan pastikan outputnya sesuai dengan ekspektasi.
    }
}
