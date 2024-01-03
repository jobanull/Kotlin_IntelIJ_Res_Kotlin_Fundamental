package fundamental

import kotlin.Boolean

class Boolean {
    fun boolean(jam : Int){

        var result : Boolean

        result =if(jam in 7..23){
            true
        }else {
            false
        }
        println(result)

        // --------------

        result = if(jam < 7 || jam > 18){
            true
        }else{
            false
        }
        println(result)

        //--------------

        val open = 7
        val newResult = jam > open
        result = if(!newResult){
            true
        }else{
            false
        }
        println(result)
    }
}