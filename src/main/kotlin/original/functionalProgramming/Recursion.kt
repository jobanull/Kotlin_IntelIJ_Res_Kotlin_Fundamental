package original.functionalProgramming

import junit.framework.TestCase.assertEquals
import org.junit.Test

class Recursion {
    fun factorial(n: Int): Int {
        return if (n == 1) {
            n
        } else {
            n * factorial(n - 1)
        }
    }

    tailrec fun factorial(n: Int, result: Int = 1): Int {
        val newResult = n * result
        return if (n == 1) {
            newResult
        } else {
            factorial(n - 1, newResult)
        }
    }
}

class RecursionTest{
    private val recursion = Recursion()

    @Test
    fun factorialNonTailRec() {
        assertEquals(1, recursion.factorial(1))
        assertEquals(120, recursion.factorial(5))
        assertEquals(3628800, recursion.factorial(10))
    }

    @Test
    fun factorialTailRec() {
        assertEquals(1, recursion.factorial(1, 1))
        assertEquals(120, recursion.factorial(5, 1))
        assertEquals(3628800, recursion.factorial(10, 1))
    }
}