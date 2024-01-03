package functionalProgramming

class HigherOrderFunction {
    // Higher-Order Function
    var sum: (Int) -> Int = { value -> value + value }
    fun latihanHigherOrderfun(value: Int, sum: (Int) -> Int){
        val result = sum(value)
        println(result)
    }

    inline fun printResult(value: Int, sum: (Int) -> Int) {
        val result = sum(value)
        println(result)
    }
}