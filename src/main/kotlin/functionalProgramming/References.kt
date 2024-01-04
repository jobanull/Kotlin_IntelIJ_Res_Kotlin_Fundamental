package functionalProgramming

import org.junit.Test

class MemberReferences {
    val sums: (Int, Int) -> Int = ::count
    private fun count(valueA: Int, valueB
    : Int): Int {
        return valueA + valueB
    }
}

class FunctionReferences{
    private fun isEvenNumber(number: Int) = number % 2 == 0

    fun show(){
        val numbers = 1.rangeTo(10)
        val evenNumber = numbers.filter(::isEvenNumber)
        println(evenNumber)
    }
}

class PropertyReferences{
    private var message = "Kotlin"
    fun show(){
        println(::message.name)
        println(::message.get())

        ::message.set("Kotlin Academy")

        println(::message.get())
    }
}
class ReferencesTest{
    private val memberReferences = MemberReferences()
    private val functionReferences = FunctionReferences()
    private val propertyReferences = PropertyReferences()

    // Function References

    @Test
    fun memberReferencesTest(){
        println(memberReferences.sums(2,2))
        functionReferences.show()
        propertyReferences.show()
    }
}