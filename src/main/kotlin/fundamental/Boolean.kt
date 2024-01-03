package fundamental

import org.junit.Test
import kotlin.Boolean

class Boolean {
    fun bool1(hour : Int){

        val result : Boolean = if(hour in 7..23){
            true
        }else {
            false
        }
        println(result)
    }

    fun bool2(hour : Int){
       val  result = if(hour < 7 || hour > 18){
            true
        }else{
            false
        }
        println(result)
    }

    fun bool3(hour : Int){
        val open = 7
        val newResult = hour > open
        val result = !newResult
        println(result)
    }
}

class BooleanTest{
    val booleanTest = Boolean()

    @Test
    fun boolTest1(){
        booleanTest.bool1(1)
    }
    @Test
    fun boolTest2(){
        booleanTest.bool2(1)
    }

    @Test
    fun boolTest3(){
        booleanTest.bool3(1)
    }
}