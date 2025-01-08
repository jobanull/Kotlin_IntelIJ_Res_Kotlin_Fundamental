package original.controlFlow

import org.junit.Test

class WhileDoWhile{
    fun wHile(value : Int){
        var counter = value
        while (counter <= 7){
            println("ini While ke : $counter")
            counter++
        }
    }

    fun doWhile(value : Int){
        var counter = value
        do {
            println("ini doWhile ke :  $counter")
            counter++
        } while (counter <= 7)
    }
}


class WhileDoWhileTest{
    val whileDoWhile = WhileDoWhile()

    @Test
    fun testWhile(){
        whileDoWhile.wHile(1)
    }

    @Test
    fun testDoWhile(){
        whileDoWhile.doWhile(1)
    }
}