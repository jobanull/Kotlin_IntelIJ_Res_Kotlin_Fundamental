package fundamental

class DataType {

    fun dataType(){
        val fname= "Ikhdan"
        val lname = "Joban"
        println("$fname $lname")

        // -----------

        println("\n")
        var a: Char ='A'
        println(a++)
        println(a++)
        println(a++)
        println(a++)

        println("\n")

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