package original.functionalProgramming

import org.junit.Test


fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

val Int.slice: Int
    get() = this / 2


class ExtensionTest{
    @Test
    fun setTest(){
        println(10.printInt())
        println(20.plusThree())
        println(30.slice)
    }
}
