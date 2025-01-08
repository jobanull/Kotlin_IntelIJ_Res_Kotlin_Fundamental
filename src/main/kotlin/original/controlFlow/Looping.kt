package original.controlFlow

import org.junit.Test

class Looping {
    fun loooping(){
        // Example 1
        val ranges = 1.rangeTo(10) step 3
        for (i in ranges ){
            println("value is $i!")
        }

        // Example 2
        val ranges2 = 1.rangeTo(10) step 3
        for ((index, value) in ranges2.withIndex()) {
            println("value $value with index $index")
        }

        // Example 3
        val ranges3 = 1.rangeTo(10) step 3
        ranges3.forEach { value ->
            println("value is $value!")
        }

        // Example 4
        val ranges4 = 1.rangeTo(10) step 3
        ranges4.forEachIndexed { index, _ ->
            println("index $index")
        }
    }
}

class LoopingTest{
    var looping = Looping()
    @Test
    fun loopingTest(){
        looping.loooping()
    }
}