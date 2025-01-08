package orgfunctionalProgramming

import org.junit.Test

class FoldDropTake {
    fun foldDropTake(){
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
        val dropLast = number.dropLast(3)

        println("DROP : $drop")
        println("DROP LAST : $dropLast")

        val total = listOf(1, 2, 3, 4, 5, 6)
        val take = total.take(3)
        val takeLast = total.takeLast(3)

        println("TAKE : $take")
        println("TAKE LAST : $takeLast")
    }
}

class FoldDropTakeTesting{
    private val value = FoldDropTake()

    @Test
    fun testing(){
        value.foldDropTake()
    }
}