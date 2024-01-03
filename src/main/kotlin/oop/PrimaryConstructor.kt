package modul.oop

class PrimaryConstructor {
    class Animal2(name: String, weight: Double, age: Int, isMammal: Boolean) {
        val name: String
        val weight: Double
        val age: Int
        val isMammal: Boolean

        init {
            this.weight = if(weight < 0) 0.1 else weight
            this.age = if(age < 0) 0  else age
            this.name = name
            this.isMammal = isMammal
        }
    }
}