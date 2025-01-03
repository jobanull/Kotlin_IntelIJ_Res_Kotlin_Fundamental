package training.oop

import org.junit.Test

class AnimalModifier(
    private var name: String,
    private val weight: Double,
    private val age: Int,
    private val isMammal: Boolean = true
) {
    // TODO 1
    // Buat fungsi getName yang mengembalikan nama hewan.

    fun getName() : String {
        // Implementasikan logika untuk mengembalikan nama di sini.
        return ""
    }

    // TODO 2
    // Buat fungsi setName yang menerima parameter newName dan mengubah nama hewan.

    fun setName(newName: String) {
        // Implementasikan logika untuk mengubah nama di sini.
    }
}

open class Lion(val name: String, protected val weight: Double)

class Dog(pName: String, pWeight: Double) : Lion(pName, pWeight)

class VisibilityModifierTest {
    // TODO 3
    // Buat instance dari AnimalModifier dan Dog dengan parameter tertentu.
    val animalModifier = AnimalModifier("Cheetah", 20.0, 10, true)
    val dog = Dog("Angora", 1.2)

    @Test
    fun visibilityModifierTest() {
        // TODO 4
        // Uji fungsi getName dan setName pada instance AnimalModifier, serta akses properti name pada instance Dog.
        println(animalModifier.getName())
        animalModifier.setName("Elephant")
        println(animalModifier.getName())
        println(dog.name)
    }
}
