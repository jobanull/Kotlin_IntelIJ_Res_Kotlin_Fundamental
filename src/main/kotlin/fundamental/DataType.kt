package fundamental

import org.junit.Test

class DataType {

    fun dataType(){
        val firstName= "Ikhdan"
        val lastName = "Joban"
        println("$firstName $lastName")

        // -----------

        val line = """ 
            Line 1
            Line 2
            Line 3
            Line 4
        """.trimMargin()
        println(line)
    }
}


class DataTypeTest{
    val dataType = DataType()
    @Test
    fun dataTypeTest(){
        dataType.dataType()
    }
}