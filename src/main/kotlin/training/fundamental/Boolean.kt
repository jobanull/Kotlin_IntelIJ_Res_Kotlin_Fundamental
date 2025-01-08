package training.fundamental

import org.junit.Test
import kotlin.Boolean

class Boolean {
    fun bool1(hour: Int) {
        // TODO 1
        // Tentukan apakah jam (hour) berada dalam rentang 7 hingga 23.
        val result : Boolean = if(hour in 7..23){
            true
        }else{
            false
        }

        // TODO 2
        // Cetak hasil evaluasi boolean tersebut.

        println(result)
    }

    fun bool2(hour: Int) {
        // TODO 3
        // Tentukan apakah jam (hour) berada di luar rentang 7 hingga 18.
        val result = if(hour< 7 || hour > 18){
            true
        }else {
            false
        }

        // TODO 4
        // Cetak hasil evaluasi boolean tersebut.
        println(result)
    }

    fun bool3(hour: Int) {
        // TODO 5
        // Buat variabel `open` dengan nilai 7.
        val open = 7

        // TODO 6
        // Tentukan apakah jam (hour) lebih besar dari `open`.
        val newResult = hour > open

        // TODO 7
        // Gunakan operator `!` untuk membalikkan hasil evaluasi.
        val result = !newResult

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
        booleanTest.bool1(10)
    }

    @Test
    fun boolTest2() {
        // TODO 10
        // Panggil fungsi `bool2` dengan parameter tertentu.
        booleanTest.bool2(2)
    }

    @Test
    fun boolTest3() {
        // TODO 11
        // Panggil fungsi `bool3` dengan parameter tertentu.
        booleanTest.bool3(3)
    }
}