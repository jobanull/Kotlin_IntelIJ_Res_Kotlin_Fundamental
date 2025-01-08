package training.oop

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.io.OutputStream
import java.io.PrintStream

abstract class AbstractClass(
    var name: String,
    var weight: Double,
    var age: Int,
    var isCarnivore: Boolean
) {
    // TODO 1
    // Buat fungsi eat yang mencetak "<name> is eating!".

    // TODO 2
    // Buat fungsi sleep yang mencetak "<name> is sleeping!".
}

class AbstractClassTest {
    // TODO 3
    // Buat instance anonim dari AbstractClass dengan parameter
    // yang sesuai, misalnya "Cat", 2.6, 1, true.
    private val abstractInstance = object : AbstractClass("Cat", 2.6, 1, true) {}

    @Test
    fun testEat() {
        // TODO 4
        // Uji fungsi eat() dan pastikan outputnya sesuai dengan ekspektasi.
        val expectedOutput = "Cat is eating!"
//        assertEquals(expectedOutput, captureOutput { abstractInstance.eat() })
    }

    @Test
    fun testSleep() {
        // TODO 5
        // Uji fungsi sleep() dan pastikan outputnya sesuai dengan ekspektasi.
        val expectedOutput = "Cat is sleeping!"
//        assertEquals(expectedOutput, captureOutput { abstractInstance.sleep() })
    }

    private fun captureOutput(block: () -> Unit): String {
        // TODO 6
        // Buat fungsi untuk menangkap output dari println
        // agar dapat dibandingkan dengan ekspektasi.
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
