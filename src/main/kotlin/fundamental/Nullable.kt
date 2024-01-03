package fundamental

import org.junit.Test

class Nullable {
    fun nullable(name: String){

        if(name != null) {
            println(name)
        }

        val loc : String? = null
        loc?.length

        val text: String? = null
        val textLength = text?.length ?: 7
        println(textLength)

        val testing : String? = null
        testing!!.length
    }

    // Nullable Receiver
    val Int?.slice2: Int
        get() = this?.div(2) ?: 0

}


class NullableTest{
    val nullableTest = Nullable()

    @Test
    fun nullableTest(){
        nullableTest.nullable("Asep")
    }
}