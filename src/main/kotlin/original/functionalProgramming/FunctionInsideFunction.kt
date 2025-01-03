package original.functionalProgramming

import org.junit.Test

class FunctionInsideFunction {

    // Example 1
    fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
        if (valueA == 0) {
            throw IllegalArgumentException("valueA must be better than 0")
        }

        if (valueB == 0) {
            throw IllegalArgumentException("valueB must be better than 0")
        }

        if (valueC == 0) {
            throw IllegalArgumentException("valueC must be better than 0")
        }

        return valueA + valueB + valueC
    }

    // Example 2
    fun sum2(valueA: Int, valueB: Int, valueC: Int): Int {
        fun validateNumber(value: Int) {
            if (value == 0) {
                throw IllegalArgumentException("value must be better than 0")
            }
        }

        validateNumber(valueA)
        validateNumber(valueB)
        validateNumber(valueC)

        return valueA + valueB + valueC
    }

    // Example 3
    fun sum3(valueA: Int, valueB: Int, valueC: Int): Int {
        fun Int.validateNumber(){
            if (this == 0) {
                throw IllegalArgumentException("value must be better than 0")
            }
        }

        valueA.validateNumber()
        valueB.validateNumber()
        valueC.validateNumber()

        return valueA + valueB + valueC
    }
}

class FunctionInsideFunctionTest{
    private val fifTest = FunctionInsideFunction()
    @Test
    fun fifTest(){
        val val1 = fifTest.sum(1,2,3)
        val val2 =fifTest.sum2(4,5,6)
        val val3 = fifTest.sum3(7,8,9)
        println(val1)
        println(val2)
        println(val3)
    }
}