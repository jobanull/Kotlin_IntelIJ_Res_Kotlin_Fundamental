package functionalProgramming

import org.junit.Test

typealias Arithmetic = (Int, Int) -> Int

class FunctionType {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
}

class FunctionTypeTest{
    private val functionType = FunctionType()

    @Test
    fun functionTypeTest(){
        val sumResult = functionType.sum(10,10)
        val multiplyResult = functionType.multiply(20,20)

        println(sumResult)
        println(multiplyResult)
    }
}