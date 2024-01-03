package fundamental

import org.junit.Test

class Numbers{
    fun numbers(){
        val long: Long = 100L
        val short: Short = 10
        val byte: Byte = Byte.MAX_VALUE
        val double: Double = 1.3
        val float: Float = 0.134f
        val maxLong = Long.MAX_VALUE

        println(long)
        println(short)
        println(byte.toInt())
        println(double)
        println(float)
        println(maxLong)
    }
}

class NumbersTest{
    val numbers = Numbers()

    @Test
    fun numbersTest(){
        numbers.numbers()
    }
}