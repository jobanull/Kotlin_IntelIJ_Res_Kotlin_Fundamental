package modul.oop

class Overloading {
    class Animal8(private var name: String) {
        fun eat() {
            println("$name makan!")
        }

        fun eat(typeFood: String) {
            println("$name memakan $typeFood!")
        }

        fun eat(typeFood: String, quantity: Double) {
            println("$name memakan $typeFood sebanyak $quantity grams!")
        }

        fun sleep() {
            println("$name tidur!")
        }
    }

    class Calculator {
        fun add(value1: Int, value2: Int) = value1 + value2
        fun add(value1: Int, value2: Int, value3: Int) = value1 + value2 + value3
        fun add(value1: Double, value2: Double) = value1 + value2
        fun add(value1: Float, value2: Float) = value1 + value2

        fun min(value1: Int, value2: Int) = if (value1 < value2) value1 else value2
        fun min(value1: Double, value2: Double) = if (value1 < value2) value1 else value2
    }
}