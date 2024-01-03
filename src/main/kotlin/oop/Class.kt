package oop

import kotlin.reflect.KProperty

class Class (val name: String,
           val weight: Double,
           val age: Int,
           val isMammal: Boolean
) {
    // Properties
    var names: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }


    // Properties Delegation
    var name2: String by DelegateName()

    fun eat(){
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}


// Properties Delegation
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}


// Extension Properties



// Primary Constructor


// Secondary Constructor


// Visibility Modifiers


// Inheritances

// Overloading


// Abstract Class

// Interface
interface IFly {
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}