package modul.oop

class Inheritance {
    open class Animal7(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

        open fun eat(){
            println("$name sedang makan!")
        }

        open fun sleep(){
            println("$name sedang tidur!")
        }
    }

    class Cat1(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean)
        : Animal7(pName, pWeight, pAge, pIsCarnivore) {

        fun playWithHuman() {
            println("$name bermain bersama Manusia !")
        }

        override fun eat(){
            println("$name sedang memakan ikan !")
        }

        override fun sleep() {
            println("$name sedang tidur di bantal !")
        }
    }

}