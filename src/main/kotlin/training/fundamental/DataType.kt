package training.fundamental

import org.junit.Test

class DataType {

    fun dataType() {
        // TODO 1
        // Buat dua variabel untuk menyimpan nama depan (firstName) dan nama belakang (lastName).
        // Cetak nama lengkap menggunakan interpolasi string.
        var fName = ""
        var lName = ""



        // TODO 3
        // Buat variabel untuk menyimpan teks multiline menggunakan triple quotes (""" ... """).
        // Gunakan fungsi `trimMargin()` untuk merapikan teks multiline tersebut.
        val line = ""

        // TODO 5
        // Cetak teks multiline tersebut.
        println(line)
    }
}

class DataTypeTest {
    val dataType = DataType()

    @Test
    fun dataTypeTest() {
        dataType.dataType()
    }
}
