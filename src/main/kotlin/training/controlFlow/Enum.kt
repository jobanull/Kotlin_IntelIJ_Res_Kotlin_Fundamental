package training.controlFlow

import org.junit.Test

// Example 1
enum class EnumAnimal(val value: String) {
    // TODO 1
    // Tambahkan elemen enum dengan nilai string untuk setiap jenis hewan (misal: CAT, DOG, LION).
}

// Example 2
enum class EnumColors(val value: Int) {
    // TODO 2
    // Tambahkan elemen enum dengan nilai integer (warna dalam format heksadesimal)
    // dan buat fungsi abstrak printValue untuk mencetak nilai setiap warna.
    // Misal: RED, GREEN, BLUE.
}

// Example 3
enum class EnumNumber(val value: Int) {
    // TODO 3
    // Tambahkan elemen enum dengan nilai integer untuk angka tertentu.
    // Misal: ONE, TWO, THREE.
}

// Example 4
enum class EnumName(val value: String) {
    // TODO 4
    // Tambahkan elemen enum dengan nilai string untuk nama tertentu.
    // Misal: ASEP, JAJANG.
}

class EnumTest {
    // TODO 5
    // Deklarasikan variabel untuk EnumAnimal, EnumColors, EnumNumber, dan EnumName.

    @Test
    fun enumTest1() {
        // TODO 6
        // Cetak nilai enum EnumAnimal menggunakan println.
        // Panggil fungsi printValue untuk setiap elemen EnumColors.
        // Iterasi elemen EnumNumber dan cetak masing-masing.
        // Gunakan when untuk mengecek nilai EnumName dan cetak hasilnya.
    }
}
