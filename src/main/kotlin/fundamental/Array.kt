package fundamental

import org.junit.Test

class Array {
    fun array(){
        val array = arrayOf(1,3,5,7)
        val mixArray = arrayOf(1,3,5,7,"Joban",true)
        val intArray = intArrayOf(1,2,3,4,5)
        val doubleArray = doubleArrayOf(1.2,1.3,1.4,1.5)

        intArray[3] = 80
        println("Array :")
        // Using ForEach loop
        array.forEach { println("$it ") }

        println("Mix Array :")
        // Using for loop
        for(e in mixArray){
            println(e)
        }

        println("Int Array")
        // Using for loop with index
        for((index, element) in array.withIndex()){
            println("Index : $index, Element : $element")
        }

        println("Double Array")
        // Using while loop
        var index = 0
        while(index < doubleArray.size){
            println(array[index])
            index++
        }
    }
}


class ArrayTest{
    val arrayTest = Array()
    @Test
    fun testArray(){
        arrayTest.array()
    }
}