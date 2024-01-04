package dataClass

import org.junit.Test

class List {
    var numberList = emptyList<Int>()
    var charList = emptyList<Char>()
    var anyList = emptyList<Any>()
    var mutableList = mutableListOf<Any>()
    fun list(){
        numberList = listOf(1, 2, 3, 4, 5)
        charList = listOf('a', 'b', 'c')
        anyList = listOf('a', "Kotlin", 3, true)
        mutableList = mutableListOf('a', "Kotlin", 3, true)
        println(numberList)
        println(charList)
        println(anyList)

        mutableList.add('d') // Add an item at the end of the list
        mutableList.add(1, "love") // Adds items at index 1
        mutableList[3] = false // Changes the item value at the 3rd index
        mutableList.removeAt(0) // Deletes the item at index 0
        println(mutableList)
    }
}

class ListTest{
    private val list = List()

    @Test
    fun listTest(){
        list.list()
    }

}