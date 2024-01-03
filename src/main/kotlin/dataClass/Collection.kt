package dataClass

class Collection {
    fun latihanCollectionsOperations(){
        val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val evenList = numberList.filter { it % 2 == 0 }
        val notEvenList = numberList.filterNot { it % 2 == 0 }
        val multipliedBy5 = numberList.map { it * 5 }
        print(numberList.count())
        print(numberList.count { it % 3 == 0 })

        val firstOddNumber = numberList.find { it % 2 == 1 }
        val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

        val moreThan10 = numberList.first { it > 10 }
        print(moreThan10)

        val total = numberList.sum()

        val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
        val ascendingSort = kotlinChar.sorted()
        println(ascendingSort)

        val descendingSort = kotlinChar.sortedDescending()
        println(descendingSort)
    }
}