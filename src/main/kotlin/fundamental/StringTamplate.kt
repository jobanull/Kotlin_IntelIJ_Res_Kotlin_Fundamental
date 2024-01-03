package fundamental

import org.junit.Test

class StringTamplate {
    fun stringTemplate(name: String, age: Int): String{
        return "My name is $name, i'm $age years old"
    }
}


class StringTemplateTest{
    val stringTamplate = StringTamplate()
    @Test
    fun stringTemplateTest(){
        val value =  stringTamplate.stringTemplate("Asep", 23)
        println(value)
    }
}