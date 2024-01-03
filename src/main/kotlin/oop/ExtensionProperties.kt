package modul.oop

import org.junit.Test


class Animal(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Animal.getAnimalInfo : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"


class ExtensionPropertiesTest{
    val animal = Animal("Lion", 150.5, 5, true)

    @Test
    fun extensionPropertiesTest(){
        println(animal.getAnimalInfo)

    }
}