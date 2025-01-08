package training.fundamental

import org.junit.Test
import kotlin.random.Random

class Expression {

    fun ifExpression(value: Int) {
        // TODO 1
        // Gunakan if-else untuk mengevaluasi nilai (value).
        // Cetak hasil evaluasi sesuai kondisi: "Belum Lulus", "Lulus", atau "Lulus dengan nilai sempurna".

    }

    fun ifExpression2(hour: Int) {
        // TODO 2
        // Gunakan if-else dalam bentuk ekspresi untuk mengevaluasi apakah kantor sudah buka atau tutup.
        // Cetak hasilnya.
        val openOffice = 8
        val office = 0
        println(office)
    }

    fun whenExpression(vals: Int) {
        // TODO 3
        // Gunakan when untuk mengevaluasi nilai tertentu (vals).
        // Cetak hasilnya berdasarkan nilai yang diberikan.
        val value = vals

        // TODO 4
        // Gunakan when sebagai ekspresi untuk mengembalikan nilai berdasarkan kondisi.

        val stringOfValue = 0
        println(stringOfValue)

        // TODO 5
        // Gunakan when untuk mengevaluasi tipe data dari suatu variabel (Any).
        val anyType: Any = 100L

        // TODO 6
        // Gunakan when untuk mengevaluasi values apakah suatu nilai berada dalam rentang tertentu.
        val values = 27
        val ranges = 10..50

        // TODO 7
        // Gunakan when dengan ekspresi bersarang untuk memanfaatkan hasil dari fungsi lain.
        val registerNumber= 0
        println(registerNumber)
    }
    // Lengkapi fungsi ini yang mengembalikan nilai random sampai 100
    private fun getRegisterNumber(): Int = 0
}

class ExpressionTest {
    val expression = Expression()

    @Test
    fun ifExpression1Test() {
        expression.ifExpression(8)
    }

    @Test
    fun ifExpression2Test() {
        expression.ifExpression2(0)
    }

    @Test
    fun whenExpressionTest() {
        expression.whenExpression(10)
    }
}
