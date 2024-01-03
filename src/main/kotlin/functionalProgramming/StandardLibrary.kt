package functionalProgramming

class StandardLibrary {
    fun latihanKotlinStandardLibrary(){

        val buildString = StringBuilder().apply {
            append("Hello ")
            append("Kotlin ")
        }

        // Run
        val text = "Hello"
        val result = text.run {
            val from = this
            val to = this.replace("Hello", "Kotlin")
            "replace text from $from to $to"
        }
        print("result : $result")

        // With
        val message = "Hello Kotlin!"
        val result2 = with(message) {
            println("value is $this")
            println("with length ${this.length}")
        }

        val message2 = "Hello Kotlin!"
        val result3 = with(message2) {
            "First character is ${this[0]}" +
                    " and last character is ${this[this.length - 1]}"
        }

        println(result3)

        // Apply
        val message3 = StringBuilder().apply {
            append("Hello ")
            append("Kotlin!")
        }

        println(message3.toString())

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

        println("text -> $result4")
    }
}