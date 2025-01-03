package training.dataClass

import org.junit.Test

data class DataClassUser(val name: String, val age: Int) {
    fun intro() {
        // TODO 1
        // Gunakan string template untuk mencetak perkenalan diri dengan format "My name is $name, I am $age years old".
        println("My name is $name, I am $age years old")
    }
}

class DataClass(val name: String, val age: Int) {
    override fun toString(): String {
        // TODO 2
        // Implementasikan fungsi toString untuk mengembalikan representasi string dari objek DataClass dengan format "User(name=$name, age=$age)".
        return "User(name=$name, age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        // TODO 3
        // Periksa apakah objek yang dibandingkan sama dengan objek ini.
        if (this === other) return true

        // TODO 4
        // Periksa apakah objek yang dibandingkan adalah instansi yang sama dari kelas DataClass.
        if (javaClass != other?.javaClass) return false

        other as DataClass

        // TODO 5
        // Bandingkan nilai properti name dan age untuk menentukan apakah objek ini sama dengan objek lain.
        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        // TODO 6
        // Hitung hashCode berdasarkan nilai name dan age.
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

class DataClassTest {
    val dataClassUser1 = DataClassUser("Asep", 20)
    val dataClassUser2 = DataClassUser("Asep", 20)
    val dataClassUser3 = DataClassUser("Asep", 20)
    val dataClass1 = DataClass("Jajang", 20)
    val dataClass2 = DataClass("Jajang", 20)
    val dataClass3 = DataClass("Asep", 20)

    @Test
    fun dataClassTest() {
        // TODO 7
        // Bandingkan dataClassUser1 dengan dataClassUser2 dan cetak hasil perbandingan.
        println(dataClassUser1 == dataClassUser2)

        // TODO 8
        // Bandingkan dataClassUser1 dengan dataClassUser3 dan cetak hasil perbandingan.
        println(dataClassUser1 == dataClassUser3)

        // TODO 9
        // Bandingkan dataClass1 dengan dataClass2 dan cetak hasil perbandingan.
        println(dataClass1 == dataClass2)

        // TODO 10
        // Bandingkan dataClass1 dengan dataClass3 dan cetak hasil perbandingan.
        println(dataClass1 == dataClass3)
    }
}