package functionalProgramming

// Ini masuk Function Type
typealias Arithmetic = (Int, Int) -> Int

class FunctionType {

    fun latihanFunctionType(){
        val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
        val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

        val sumResult = sum(10, 10)
        val multiplyResult = multiply(20, 20)
    }
}