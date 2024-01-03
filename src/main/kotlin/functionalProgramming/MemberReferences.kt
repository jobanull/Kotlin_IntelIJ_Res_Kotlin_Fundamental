package functionalProgramming

class MemberReferences {
    val sums: (Int, Int) -> Int = ::count
    fun count(valueA: Int, valueB
    : Int): Int {
        return valueA + valueB
    }

//    fun isEvenNumber(number: Int) = number % 2 == 0
//    fun Int.isEvenNumber() = this % 2 == 0
//    var message = "Kotlin"

}