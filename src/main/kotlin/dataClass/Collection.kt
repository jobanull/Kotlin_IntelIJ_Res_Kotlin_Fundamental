package dataClass

import org.junit.Test

class Collection {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    var evenList = emptyList<Number>()
    var notEvenList = emptyList<Number>()
    var multipliedBy5 = emptyList<Number>()
    fun collectionsOperations(){

        evenList = numberList.filter { it % 2 == 0 }
        notEvenList = numberList.filterNot { it % 2 == 0 }
        multipliedBy5 = numberList.map { it * 5 }
        println("COUNT : ${numberList.count()}")
        println("MODULUS : ${numberList.count { it % 3 == 0 }}")
        println("EVEN LIST : $evenList")
        println("NOT EVEN LIST : $notEvenList")
        println("MUTIPLIED BY 5 : $multipliedBy5")

        val firstOddNumber = numberList.find { it % 2 == 1 }
        val firstOrNullNumber = numberList.firstOrNull { it % 2 == 1 }
        println("FIRST ODD NUMBER : $firstOddNumber")
        println("FIRST ODD OR NULL NUMBER : $firstOrNullNumber")

        val moreThan10 = numberList.first { it > 10 }
        println("MORE THAN 10 : $moreThan10")

        val total = numberList.sum()
        println("TOTAL : $total")

        val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
        val ascendingSort = kotlinChar.sorted()
        println("ASCENDING SORT : $ascendingSort")

        val descendingSort = kotlinChar.sortedDescending()
        println("DESCENDING SORT : $descendingSort")
    }
}

class CollectionTest{
    val collection = Collection()

    @Test
    fun collectionTest(){
        collection.collectionsOperations()
    }

}