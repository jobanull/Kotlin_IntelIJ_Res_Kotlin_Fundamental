package original.functionalProgramming

import org.junit.Test

class NamedAndDefaultArgument {
    fun getFullName(first: String, middle: String, last: String): String {
        return "$first $middle $last"
    }

    fun getFullName2(
        first: String = "Kotlin",
        middle: String = " is ",
        last: String = "Awesome"): String {
        return "$first $middle $last"
    }
}


class NamedAndDefaultArgumentTest{
    private val namedAndDefaultArgument = NamedAndDefaultArgument()

    @Test
    fun namedAndDefaultArgumentTest(){
        println(namedAndDefaultArgument.getFullName("Asep", "Kusnadi", "Jawa"))
        println(namedAndDefaultArgument.getFullName2("Jajang", "Janeal", "Zulkifli"))


    }
}