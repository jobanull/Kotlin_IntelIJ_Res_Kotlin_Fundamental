package modul.oop

import org.junit.Test

class AnimalModifier(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}
open class Lion(val name: String, protected val weight: Double)
class Dog(pName: String, pWeight: Double) : Lion(pName, pWeight)

// INTERNAL CLASS ?

class VisibilityModifierTest {
    val animalModifier = AnimalModifier("Cheetah", 20.0, 10, true)
    val dog = Dog("Angora", 1.2)

    @Test
    fun visibilityModifierTest() {
        println(animalModifier.getName())
        animalModifier.setName("Elephant")
        println(animalModifier.getName())
        println(dog.name)

    }
}