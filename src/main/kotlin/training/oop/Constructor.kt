package training.oop

class PrimaryConstructor(name: String, weight: Double, age: Int, isMammal: Boolean) {
    // TODO 1
    // Buat properti name, weight, age, dan isMammal sebagai bagian dari kelas ini.

    init {
        // TODO 2
        // Inisialisasi properti weight agar nilainya tidak kurang dari 0.1.
        // Inisialisasi properti age agar nilainya tidak kurang dari 0.
        // Inisialisasi properti name dan isMammal.
    }
}

class SecondaryConstructor(name: String, weight: Double, age: Int) {
    // TODO 3
    // Buat properti name, weight, age, dan isMammal sebagai bagian dari kelas ini.

    init {
        // TODO 4
        // Inisialisasi properti weight agar nilainya tidak kurang dari 0.1.
        // Inisialisasi properti age agar nilainya tidak kurang dari 0.
        // Inisialisasi properti name dan isMammal (default-nya false).
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        // TODO 5
        // Tambahkan logika untuk menginisialisasi isMammal jika konstruktor kedua digunakan.
    }
}
