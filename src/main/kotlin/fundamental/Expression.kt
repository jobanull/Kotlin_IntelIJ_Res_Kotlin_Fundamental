package fundamental

import kotlin.random.Random

class Expression {
    fun ifExpres(nilai : Int){
        if(nilai <= 5){
            println("Belum Lulus")
        }else if(nilai <= 8){
            println("Lulus")
        }else{
            println("Lulus dengan nilai sempurna")
        }
    }

    fun latihanExppression(hour: Int){
        val openOffice = 7
        val office = if (hour > openOffice) "Office already open" else "Office close"
        println(office)
    }

    fun whenExpression(vals : Int){
        val value = vals

        when(value){
            6 -> println("value is 6")
            7 -> println("value is 7")
            8 -> println("value is 8")
            else -> println("value cannot be reached")
        }

        val stringOfValue = when (value) {
            6 -> {
                println("Six")
                "value is 6"
            }
            7 -> {
                println("Seven")
                "value is 7"
            }
            8 -> {
                println("Eight")
                "value is 8"
            }
            else -> {
                println("undefined")
                "value cannot be reached"
            }
        }
        println(stringOfValue)

        val anyType: Any = 100L
        when (anyType) {
            is Long -> println("the value has a Long type")
            is Int -> println("the value has a Int type")
            is Double -> println("the value has a Double type")
            else -> println("undefined")
        }

        val values =  27
        val ranges = 10..50

        when(values){
            in ranges -> println("value is in the range")
            !in ranges -> println("value is outside the range")
            else -> println("value undefined")
        }

        val registerNumber = when(val regis = getRegisterNumber()){
            in 1..50 -> 50 * regis
            in 51..100 -> 100 * regis
            else -> regis
        }
    }

    private fun getRegisterNumber() = Random.nextInt(100)

}