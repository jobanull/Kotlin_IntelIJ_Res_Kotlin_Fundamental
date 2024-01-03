package controlFlow

class Ranges {
    fun ranges(value: Int){
        val rangeInts = value.rangeTo(10)

        val rangeInt = value..10 step 2
        rangeInt.forEach {
            print("$it ")
        }
        println(rangeInt.step)

        val downTo = value.downTo(1)
        if(7 in downTo){
            println("Value 7 Avaliable")
        }

        val rangeChar = 'A'.rangeTo('F')
        println(rangeChar)
    }
}