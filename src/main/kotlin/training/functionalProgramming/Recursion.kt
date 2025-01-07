package training.functionalProgramming

import junit.framework.TestCase.assertEquals
import org.junit.Test

class Recursion {
    fun factorial(n: Int): Int {
        // TODO 1
        // Implementasikan fungsi rekursif untuk menghitung faktorial n tanpa menggunakan tail recursion.
        return 0 // TODO 2
    }

    tailrec fun factorial(n: Int, result: Int = 1): Int {
        // TODO 3
        // Implementasikan fungsi rekursif dengan tail recursion untuk menghitung faktorial n.
        val newResult = 0
        return 0
    }
}

class RecursionTest {
    private val recursion = Recursion()

    @Test
    fun factorialNonTailRec() {
        // TODO 7
        // Uji fungsi `factorial` tanpa tail recursion dengan nilai 1, 5, dan 10.
        assertEquals(1, recursion.factorial(1))
        assertEquals(120, recursion.factorial(5))
        assertEquals(3628800, recursion.factorial(10))
    }

    @Test
    fun factorialTailRec() {
        // TODO 8
        // Uji fungsi `factorial` dengan tail recursion dengan nilai 1, 5, dan 10.
        assertEquals(1, recursion.factorial(1, 1))
        assertEquals(120, recursion.factorial(5, 1))
        assertEquals(3628800, recursion.factorial(10, 1))
    }
}