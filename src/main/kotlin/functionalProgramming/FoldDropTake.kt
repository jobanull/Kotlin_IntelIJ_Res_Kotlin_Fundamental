package functionalProgramming

class FoldDropTake {
    fun latihanFoldDropTake(){
        val numbers = listOf(1, 2, 3)
        val fold = numbers.fold(10) { current, item ->
            println("current $current")
            println("item $item")
            println()
            current + item
        }

        println("Fold result: $fold")

        val number = listOf(1, 2, 3, 4, 5, 6)
        val drop = number.drop(3)
        val drop1 = number.dropLast(3)

        println(drop)

        val total = listOf(1, 2, 3, 4, 5, 6)
        val take = total.take(3)
        val take1 = total.takeLast(3)

        println(take)
    }
}