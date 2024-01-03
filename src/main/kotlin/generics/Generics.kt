package modul

// Deklarasi Class Generic

class LongList : List<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}

interface List<P> {
    operator fun get(index: Int): P

}


// Covariant
abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

// Contravariant
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}