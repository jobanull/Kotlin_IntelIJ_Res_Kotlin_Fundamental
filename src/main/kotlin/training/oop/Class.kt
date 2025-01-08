package training.oop

import org.junit.Test
import kotlin.reflect.KProperty

class Class(
    val name: String,
    val weight: Double,
    val age: Int,
    val isMammal: Boolean
) {
    // TODO 1
    // Buat sebuah properti dengan getter dan setter khusus bernama propertiesName,
    // yang mencetak pesan setiap kali getter atau setter dipanggil.

    var propertiesName: String = "Tatang Kurniawan"
        get(){
            println("Getter Function Called")
            return field
        }
        set(value){
            println("Setter Function Called")
            field = value
        }

    // TODO 2
    // Buat properti delegasi bernama propertiesDelegationName menggunakan kelas DelegateName.

    var propertiesDelegationName: String by DelegateName()
    fun eat() {
        // TODO 3
        // Buat fungsi untuk mencetak "<name> makan!".
    }

    fun sleep() {
        // TODO 4
        // Buat fungsi untuk mencetak "<name> tidur!".
    }
}

// TODO 5
// Buat kelas DelegateName dengan operator getValue dan setValue untuk properti delegasi.

class DelegateName {
    // TODO 6
    // Buat variabel untuk menyimpan nilai properti delegasi
    // dan implementasikan operator getValue dan setValue untuk menangani aksesnya.
    private  var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String{
        println("Test Getter ${property.name} in class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Value ${property.name}, from ${value} will Change to ${newValue}")
        value = newValue
    }
}

// TODO 7
// Buat interface IFly dengan properti numberOfWings dan fungsi fly.

interface IFly {
    fun fly()
    val numberOfWings: Int
}

// TODO 8
// Buat kelas Bird yang mengimplementasikan interface IFly dan override properti numberOfWings serta fungsi fly.

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if(numberOfWings > 0) println("Flying With $numberOfWings") else println("Flying without wings")
    }
}

// TODO 9
// Buat fungsi flyWithWings yang menerima parameter IFly dan memanggil fungsi fly.

fun flyWithWings(bird: Bird) {
    // Panggil fungsi fly pada parameter bird.
    bird.fly()
}

class ClassTest {
    // TODO 10
    // Buat instance dari kelas Class dengan parameter tertentu.
    private val classTest = Class("Putri", 50.0, 30, true)

    // TODO 11
    // Buat instance dari kelas Bird dengan parameter tertentu.
    private val bird = Bird(12)

    @Test
    fun classTest() {
        // TODO 12
        // Uji properti propertiesName dengan getter dan setter.
//        println(classTest.propertiesName)
//        classTest.propertiesName = "Jajang"
//        println(classTest.propertiesName)

//        println("==================================")

        // TODO 13
        // Uji properti delegasi propertiesDelegationName dengan getter dan setter.
        println(classTest.propertiesDelegationName)
        println("==================================")
        classTest.propertiesDelegationName = "Maman"
        println("==================================")
        println(classTest.propertiesDelegationName)
    }

    @Test
    fun interfaceTest() {
        // TODO 14
        // Uji fungsi fly pada instance Bird dan panggil fungsi flyWithWings.
        println(bird.fly())
        flyWithWings(bird)
    }
}
