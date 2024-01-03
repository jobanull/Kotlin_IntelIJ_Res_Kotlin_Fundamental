package modul.oop

import org.junit.Test


open class Animals(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name is eating")
    }

    open fun sleep(){
        println("$name is sleeping")
    }
}


class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean)
    : Animals(pName, pWeight, pAge, pIsCarnivore) {
        fun playWithHuman() {
            println("$name is playing with human !")
        }

        override fun eat(){
            println("$name is eating fish !")
        }

        override fun sleep() {
            println("$name is sleepping at pillow !")
        }
    }


class InheritanceTest{
    private val cat = Cat("Cat", 1.2, 2, true)

    @Test
    fun inheritanceTest(){
        cat.playWithHuman()
        cat.eat()
        cat.sleep()
    }
}