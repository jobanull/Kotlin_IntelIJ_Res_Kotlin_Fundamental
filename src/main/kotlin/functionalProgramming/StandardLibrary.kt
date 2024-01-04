package functionalProgramming

import org.junit.Test

class StandardLibrary {
    fun kotlinStandardLibrary(){

        val buildString = StringBuilder().apply {
            append("Hello ")
            append("Kotlin ")
        }

        println("BUILD STRING : $buildString")

        // Run
        val text = "Hello"
        val result = text.run {
            val from = this
            val to = this.replace("Hello", "Kotlin")
            "replace text from $from to $to"
        }
        println("RUN : $result")

        // With
        val message = "Hello Kotlin!"
        val withResult = with(message) {
            println("value is $this")
            println("with length ${this.length}")
        }
        println("WITH : $withResult")

        val message2 = "Hello Kotlin!"
        val withResult2 = with(message2) {
            "First character is ${this[0]}" +
                    " and last character is ${this[this.length - 1]}"
        }

        println("WITH RESULT : $withResult2")

        // Apply
        val message3 = StringBuilder().apply {
            append("Hello ")
            append("Kotlin!")
        }

        println("APPLY : $message3")

        // Let
        val message5: String? = null
        message5?.let {
            val length = it.length * 2
            val text = "text length $length"
            println(text)
        }

        message5?.let {
            val length = it.length * 2
            val text = "text length $length"
            println(text)
        } ?: run {
            val text = "message is null"
            println(text)
        }

        // Also
        val result4 = text.also {
            println("value length -> ${it.length}")
        }

        println("ALSO : $result4")
    }
}

class StandardLibraryTest{
    private val standardLibrary = StandardLibrary()


    @Test
    fun standardLibraryTest(){
        standardLibrary.kotlinStandardLibrary()
    }

}