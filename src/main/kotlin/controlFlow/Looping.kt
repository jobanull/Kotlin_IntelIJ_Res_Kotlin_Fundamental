package controlFlow

class Looping {
    fun loooping(){
        val ranges = 1.rangeTo(10) step 3
        for (i in ranges ){
            println("value is $i!")
        }

        val ranges2 = 1.rangeTo(10) step 3
        for ((index, value) in ranges2.withIndex()) {
            println("value $value with index $index")
        }

        val ranges3 = 1.rangeTo(10) step 3
        ranges3.forEach { value ->
            println("value is $value!")
        }

        val ranges4 = 1.rangeTo(10) step 3
        ranges4.forEachIndexed { index, _ ->
            println("index $index")
        }
    }
}