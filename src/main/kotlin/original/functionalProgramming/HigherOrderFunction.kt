package original.functionalProgramming

import org.junit.Test

class HigherOrderFunction {
    // Higher-Order Function
    var sum: (Int) -> Int = { value -> value + value }
    fun higherOrderFun(value: Int, sum: (Int) -> Int){
        val result = sum(value)
        println(result)
    }

    inline fun printResult(value: Int, sum: (Int) -> Int) {
        val result = sum(value)
        println(result)
    }
}

class HigherOrderFunctionTest{
    private val higherOrderFunction = HigherOrderFunction()

    @Test
    fun higherOrderFunctionTest(){
        higherOrderFunction.printResult(10, higherOrderFunction.sum)
        higherOrderFunction.higherOrderFun(10, higherOrderFunction.sum)
    }
}