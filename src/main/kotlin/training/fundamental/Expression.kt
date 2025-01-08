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
    }

    fun whenExpression(vals: Int) {
        // TODO 3
        // Gunakan when untuk mengevaluasi nilai tertentu (vals).
        // Cetak hasilnya berdasarkan nilai yang diberikan.

        // TODO 4
        // Gunakan when sebagai ekspresi untuk mengembalikan nilai berdasarkan kondisi.

        // TODO 5
        // Gunakan when untuk mengevaluasi tipe data dari suatu variabel (Any).

        // TODO 6
        // Gunakan when untuk mengevaluasi apakah suatu nilai berada dalam rentang tertentu.

        // TODO 7
        // Gunakan when dengan ekspresi bersarang untuk memanfaatkan hasil dari fungsi lain.
    }

    private fun getRegisterNumber(): Int {
        // TODO 8
        // Kembalikan nilai random menggunakan fungsi `Random.nextInt`.
        return 0 // Placeholder
    }
}

class ExpressionTest {
    val expression = Expression()

    @Test
    fun ifExpression1Test() {
        // TODO 9
        // Uji metode `ifExpression` dengan memberikan contoh nilai.
    }

    @Test
    fun ifExpression2Test() {
        // TODO 10
        // Uji metode `ifExpression2` dengan memberikan contoh nilai jam.
    }

    @Test
    fun whenExpressionTest() {
        // TODO 11
        // Uji metode `whenExpression` dengan memberikan contoh nilai.
    }
}
