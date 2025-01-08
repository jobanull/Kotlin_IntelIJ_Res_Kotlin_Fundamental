package training.fundamental

import org.junit.Test
import kotlin.Boolean

class Boolean {
    fun bool1(hour: Int) {
        // TODO 1
        // Tentukan apakah jam (hour) berada dalam rentang 7 hingga 23.
        val result = 0

        // TODO 2
        // Cetak hasil evaluasi boolean tersebut.
        println(result)
    }

    fun bool2(hour: Int) {
        // TODO 3
        // Tentukan apakah jam (hour) berada di luar rentang 7 hingga 18.
        var result = 0

        // TODO 4
        // Cetak hasil evaluasi boolean tersebut.
        println(result)
    }

    fun bool3(hour: Int) {
        val open = 7

        // TODO 6
        // Tentukan apakah jam (hour) lebih besar dari `open`.
        val newResult = 0
        // TODO 7
        // Gunakan operator `!` untuk membalikkan hasil evaluasi.
        val result = 0

        // TODO 8
        // Cetak hasil evaluasi boolean tersebut.
        println(result)
    }
}

class BooleanTest {
    val booleanTest = Boolean()

    @Test
    fun boolTest1() {
        // TODO 9
        // Panggil fungsi `bool1` dengan parameter tertentu.
    }

    @Test
    fun boolTest2() {
        // TODO 10
        // Panggil fungsi `bool2` dengan parameter tertentu.
    }

    @Test
    fun boolTest3() {
        // TODO 11
        // Panggil fungsi `bool3` dengan parameter tertentu.
    }
}