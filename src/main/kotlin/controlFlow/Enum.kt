package controlFlow

import org.junit.Test


// Example 1

enum class EnumAnimal(val value: String){
    CAT("CAT"),
    DOG("DOG"),
    LION("LION")
}

// Example 2
enum class EnumColors(val value: Int) {
    RED(0xFF0000) {
            override fun printValue() {
                println("value of RED is $value")
            }
                  },
    GREEN(0x00FF00) {
            override fun printValue() {
                println("value of GREEN is $value")
            }
                    },
    BLUE(0x0000FF) {
            override fun printValue() {
                println("value of BLUE is $value")
            }
    };
        abstract fun printValue()
    }

// Example 3
enum class EnumNumber(val value: Int){
    ONE(1),
    TWO(2),
    THREE(3)
}

// Example 4
enum class EnumName(val value: String){
    ASEP("ASEP"),
    JAJANG("JAJANG")
}


class EnumTest{
    private val animal = EnumAnimal.CAT
    private val color1  = EnumColors.RED
    private val color2  = EnumColors.GREEN
    private val color3  = EnumColors.BLUE
    private val number : Array<EnumNumber> = EnumNumber.entries.toTypedArray()
    private val name = EnumName.ASEP

    @Test
    fun enumTest1(){
        println(animal)
        color1.printValue()
        color2.printValue()
        color3.printValue()
        number.forEach { num ->
            println("$num")
        }
        when(name){
            EnumName.ASEP -> println("Name is Asep")
            EnumName.JAJANG -> println("Name is Jajang")
        }
    }
}