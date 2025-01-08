package training.oop

import org.junit.Test
class Overloading(private var name: String) {
    // TODO 1
    // Buat fungsi eat tanpa parameter yang mencetak "<name> eat!".

    fun eat() {
        // Implementasikan logika cetak di sini.
    }

    // TODO 2
    // Buat fungsi eat dengan satu parameter (typeFood) yang mencetak "<name> is eating <typeFood>!".

    fun eat(typeFood: String) {
        // Implementasikan logika cetak di sini.
    }

    // TODO 3
    // Buat fungsi eat dengan dua parameter (typeFood, quantity) yang mencetak "<name> ate <typeFood> as many <quantity> grams!".

    fun eat(typeFood: String, quantity: Double) {
        // Implementasikan logika cetak di sini.
    }

    // TODO 4
    // Buat fungsi sleep yang mencetak "<name> sleep!".

    fun sleep() {
        // Implementasikan logika cetak di sini.
    }
}

class OverloadingTest {
    // TODO 5
    // Buat instance dari kelas Overloading dengan parameter tertentu.
    private val overloading = Overloading("Cat")

    @Test
    fun overloadingTest() {
        // TODO 6
        // Uji fungsi eat (dengan satu parameter) dan sleep pada instance Overloading.
        overloading.eat("Meat")
        overloading.sleep()
    }
}
