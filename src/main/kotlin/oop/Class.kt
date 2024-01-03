package oop

import org.junit.Test
import kotlin.reflect.KProperty

class Class (val name: String,
           val weight: Double,
           val age: Int,
           val isMammal: Boolean
) {
    // Properties
    var propertiesName: String = "Tatang Kurniawan"
        get(){
            println("Getter function called")
            return field
        }
        set(value){
            println("Setter function calledl")
            field = value
        }


    // Properties Delegation
    var propertiesDelegationName: String by DelegateName()

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
        println("This function is the same as the getter for property ${property.name} in class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("This function is the same as the getter for property ${property.name} in class $classRef")
        println("Value ${property.name} from: $value will change to $newValue")
        value = newValue
    }
}

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


class ClassTest{
    private val classTest = Class("Putri", 50.0, 30, true)
    private val bird = Bird(12)
    @Test
    fun classTest(){
        println(classTest.propertiesName)
        classTest.propertiesName = "Jajang"
        println(classTest.propertiesName)

        println("==================================")

        println(classTest.propertiesDelegationName)
        classTest.propertiesDelegationName = "Maman"
        println(classTest.propertiesDelegationName)
    }

    @Test
    fun interfaceTest(){
        println(bird.fly())
        flyWithWings(bird)
    }
}