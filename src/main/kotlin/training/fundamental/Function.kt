package training.fundamental

import org.junit.Test

class Function {
    fun function(name: String, age: Int): String {
        // TODO 1
        // Kembalikan string dengan format "My name is $name, i'm $age years old".
        return "" // Placeholder
    }

    fun function2(name: String, age: Int) =
    // TODO 2
        // Gunakan pendekatan ekspresi untuk mengembalikan string yang sama.
        "" // Placeholder
}

class FunctionTest {
    val function = Function()

    @Test
    fun functionTest1() {
        // TODO 3
        // Uji metode `function` dengan memberikan nama dan umur.
    }

    @Test
    fun functionTest2() {
        // TODO 4
        // Uji metode `function2` dengan memberikan nama dan umur.
    }
}
