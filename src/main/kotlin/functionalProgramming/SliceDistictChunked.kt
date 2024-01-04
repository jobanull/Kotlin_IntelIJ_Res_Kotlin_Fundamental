package functionalProgramming

import org.junit.Test
import java.util.*


data class Item(val key: String, val value: Any)

class SliceDistinctChunked {
    fun sliceDistinctChunked(){
        val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val slice = total.slice(3..6)
        val slice2 = total.slice(3..6 step 2)

        println("SLICE : $slice")
        println("SLICE2 : $slice2")

        val index = listOf(2, 3, 5, 8)
        val total1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val slice3 = total1.slice(index)

        println("SLICE3 : $slice3")

        val distinct = total.distinct()
        println("DISTINCT : $distinct")

        val items = listOf(
            Item("1", "Kotlin"),
            Item("2", "is"),
            Item("3", "Awesome"),
            Item("3", "as"),
            Item("3", "Programming"),
            Item("3", "Language")
        )

        val distinctItems = items.distinctBy { it.key }
        distinctItems.forEach {
            println("${it.key} with value ${it.value}")
        }

        val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
        val distinct1 = text.distinctBy {
            it.length
        }

        println("DISTINCT1 : $distinct1")

        val word = "QWERTY"
        val chunkedTransform = word.chunked(3) {
            it.toString().lowercase(Locale.getDefault())
        }
        println("CHUNKED : $chunkedTransform")
    }
}

class SliceDistinctChunkedTest{
    private val sliceDistinctChunked = SliceDistinctChunked()

    @Test
    fun sliceDistinctChunkedTest(){
        sliceDistinctChunked.sliceDistinctChunked()
    }
}