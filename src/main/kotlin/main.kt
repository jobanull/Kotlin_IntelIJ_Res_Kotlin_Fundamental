fun main(){

    val person = Person("Joban", 24, 100)

    val eat = Eat()

    person.printStamina
    eat.perform(person)
    person.stamina = eat.modifyStamina(person.stamina, 20)
    person.printStamina
    person.addActivities(Activities.BALL.toString())
    person.showActivity()
}

enum class Activities(param : String){
    BALL("BALL")
}
class Person(var name : String, val age : Int, var stamina : Int){
    val activities = mutableListOf<String>()

    fun addActivities(activity: String){
        activities.add(activity)
    }

    fun showActivity(){
        val condition = activities.joinToString(",")

        when(condition){
            Activities.BALL.toString() -> println("Aktivitas ${Activities.BALL} ditambahkan")
            else -> println("Tidak ada list aktivitas tersebut")
        }
    }


}

internal val Person.printStamina : Unit
    get() = println("Stamina Saat Ini : ${this.stamina}")

interface StaminaActivity{
    fun modifyStamina(currentStamina : Int) : Int

    fun modifyStamina(currentStamina: Int, bonus: Int) : Int
}

abstract class Activity : StaminaActivity{
    abstract override fun modifyStamina(currentStamina: Int) : Int

    fun perform(source: Person) {
        source.stamina = modifyStamina(source.stamina)
    }
}

class Eat : Activity(){
    var stamina : Int by EatDelegate()

    override fun modifyStamina(currentStamina: Int): Int {
        val newStamina = currentStamina + 5
        this.stamina = currentStamina
        return newStamina
    }

    override fun modifyStamina(currentStamina: Int, bonus: Int) :Int{
        val newStamina = currentStamina + bonus
        println("Stamina Bonus + $bonus : $newStamina")
        return newStamina
    }
}

class EatDelegate{
    var stamina = 0

    operator fun getValue(any: Any, refClass : Any) : Int{
        println("Stamina Bertambah")
        return this.stamina
    }

    operator fun setValue(any: Any, refClass : Any, newValue : Int){
        println("Stamina Bertambah 5 : ${newValue + 5}")
        this.stamina = newValue
    }
}