package original.oop

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.io.OutputStream
import java.io.PrintStream

abstract class AbstractClass (var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){
       fun eat(){
            println("$name is eating!")
        }

        fun sleep(){
            println("$name is sleeping!")
        }
}

class AbstractClassTest{
   private val abstractInstance = object :  AbstractClass("Cat", 2.6, 1, true){}
    @Test
    fun testEat() {
        val expectedOutput = "Cat is eating!"
        assertEquals(expectedOutput, captureOutput { abstractInstance.eat() })
    }

    @Test
    fun testSleep() {
        val expectedOutput = "Cat is sleeping!"
        assertEquals(expectedOutput, captureOutput { abstractInstance.sleep() })
    }

    private fun captureOutput(block: () -> Unit): String {
        val oldOut = System.out
        val newOut = StringBuilder()
        try {
            System.setOut(PrintStream(object : OutputStream() {
                override fun write(b: Int) {
                    newOut.append(b.toChar())
                }
            }))
            block()
        } finally {
            System.setOut(oldOut)
        }
        return newOut.toString().trim()
    }
}