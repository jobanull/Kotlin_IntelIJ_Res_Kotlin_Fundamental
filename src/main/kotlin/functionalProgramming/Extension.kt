package functionalProgramming

class Extension {
    // Extension
    fun Int.printInt() {
        print("value $this")
    }

    fun Int.plusThree(): Int {
        return this + 3
    }

    val Int.slice: Int
        get() = this / 2

}