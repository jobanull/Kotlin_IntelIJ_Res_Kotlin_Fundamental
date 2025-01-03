package original.oop

import org.junit.Test

class Overloading(private var name: String) {
    fun eat() {
        println("$name eat!")
    }

    fun eat(typeFood: String) {
        println("$name is eating $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name ate $typeFood as many $quantity grams!")
    }

    fun sleep() {
        println("$name sleep!")
    }
}

class OverloadingTest{
    val overloading = Overloading("Cat")

    @Test
    fun overloadingTest(){
        overloading.eat("Meat")
        overloading.sleep()
    }


}