package training.oop

import org.junit.Test


class Animal(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

// TODO 1
// Buat properti ekstensi untuk kelas Animal bernama getAnimalInfo.
// Properti ini harus mengembalikan string dengan format:
// "Nama: <name>, Berat: <weight>, Umur: <age>, Mamalia: <isMammal>"

val Animal.getAnimalInfo: String
    get() {
        // Tambahkan logika untuk menghasilkan string informasi tentang hewan.
        return "" // Ganti dengan implementasi yang sesuai.
    }

class ExtensionPropertiesTest {
    // TODO 2
    // Buat instance dari kelas Animal dengan parameter tertentu.
    private val animal = Animal("Lion", 150.5, 5, true)

    @Test
    fun extensionPropertiesTest() {
        // TODO 3
        // Uji properti ekstensi getAnimalInfo dengan mencetak hasilnya ke konsol.
        println(animal.getAnimalInfo)
    }
}
