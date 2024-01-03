package fundamental

class Nullable {
    fun latihanNullable(){
        val name : String? = null

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