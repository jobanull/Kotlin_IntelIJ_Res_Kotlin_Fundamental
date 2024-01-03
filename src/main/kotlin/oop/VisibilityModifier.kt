package modul.oop

class VisibilityModifier {
    class Animal4(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

        fun getName() : String {
            return name
        }

        fun setName(newName: String) {
            name = newName
        }

    }
    open class Animal5(val name: String, protected val weight: Double)

    class Cat(pName: String, pWeight: Double) : Animal5(pName, pWeight)
    internal class Animal6(val name: String)
}