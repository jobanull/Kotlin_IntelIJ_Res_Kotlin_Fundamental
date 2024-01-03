package fundamental

class Array {
    fun latihanArray(){
        val array = arrayOf(1,3,5,7)
        val mixArray = arrayOf(1,3,5,7,"Joban",true)
        val intArray = intArrayOf(1,2,3,4,5)

        intArray[3] = 80
        println(array)
        println(mixArray)
        println(intArray)

    }
}