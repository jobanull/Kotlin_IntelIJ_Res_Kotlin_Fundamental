//fun main(){
//    val person = Person("Joban", 24, 25)
//    val person2 = Person("Elsa", 29)
//    val eat = Eat()
//    val run = Run()
//    val gym = Gym()
//
//    person.printRange
//    person.printStamina
//    eat.perform(person)
//    person.printStamina
//    run.perform(person)
//    person.printStamina
//    gym.perform(person)
//    gym.track(person)
//
//
//    person.printRange
//    person2.printStamina
//    eat.perform(person2)
//    person2.stamina = eat.modifyStamina(person.stamina, 24)
//    person2.printStamina
//}
//
//interface StaminaActivity{
//    fun modifyStamina(currentStamina: Int) : Int
//}
//
//interface Trackacble{
//    fun track(source: Person)
//}
//
//abstract class Activity : StaminaActivity{
//    abstract override fun modifyStamina(currentStamina : Int) : Int
//
//    fun perform(source : Person){
//        source.stamina = modifyStamina(currentStamina = source.stamina)
//    }
//}
//
//class Eat : Activity() {
//    override fun modifyStamina(currentStamina: Int): Int {
//        val newStamina =  currentStamina + 5
//        println("Stamina bertambah 5 : $newStamina")
//        return newStamina
//    }
//
//    fun modifyStamina(currentStamina: Int, bonus : Int) : Int{
//        val newStamina = currentStamina + 5 + bonus
//        println("Makan Banyak, bertambah dengan bonus $bonus")
//        return newStamina
//    }
//}
//
//class Run: Activity(){
//    override fun modifyStamina(currentStamina: Int): Int {
//        val newStamina = currentStamina - 5
//        println("Stamina berkurang 5 : $newStamina")
//        return newStamina
//    }
//}
//
//open class GymDelegate{
//    private var stamina = 0
//
//    operator fun getValue(refClass : Any, any: Any) : Int{
//        println("Stamina Saat Ini : $stamina")
//        return stamina
//    }
//
//    operator fun setValue(refClass: Any, any: Any, newValue : Int){
//        println("Stamina Berkurang 5 : ${newValue - 5}")
//        this.stamina = newValue - 5
//    }
//
//}
//
//class Gym : Activity(), Trackacble{
//    private var stamina : Int by GymDelegate()
//
//    override fun modifyStamina(currentStamina: Int): Int {
//        val newStamina = currentStamina -5
//        this.stamina = currentStamina
//        return newStamina
//    }
//
//    override fun track(source: Person) {
//        println("Aktivitas gym oleh ${source.name}, stamina saat ini ${source.stamina}")
//    }
//
//}
//
//class Person(var name : String, var age : Int, var stamina : Int){
//    init {
//        println("Primary Init dipanggil untuk $name berusia $age dan memiliki stamina $stamina")
//    }
//
//
//    constructor(name: String, age: Int) : this(name, age, stamina = 10){
//        println("Secondary Constructor untuk $name")
//    }
//
//}
//
//internal val Person.printStamina : Unit
//    get() = println("Stamina Saat Ini : ${this.stamina}")
//
//val Person.printRange : Unit
//    get() = println("=====================||=============")