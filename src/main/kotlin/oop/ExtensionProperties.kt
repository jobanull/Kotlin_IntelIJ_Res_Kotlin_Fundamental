package modul.oop

class ExtensionProperties {
    class Animal(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

    val Animal.getAnimalInfo : String
        get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"
}