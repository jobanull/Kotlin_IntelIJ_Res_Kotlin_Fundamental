package modul

import org.junit.Test

interface List<P> {
    operator fun get(index: Int): P

}

class ArrayList<T> : List<T>{
    private val elements: MutableList<T> = mutableListOf()
    override fun get(index: Int): T {
        return elements[index]
    }

    fun add(element: T){
        elements.add(element)
    }
}


// Covariant
class Covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }
}
// Contravariant
class Contravariant<in T>{
    fun sayHello(param: T){
        println("Hello $param")
    }

//     Don't do this
//     fun getData(): T{
//         return data
//     }
}

class GenericsTest{
    private val stringArrayList = ArrayList<String>()
    private val contravariantAny = Contravariant<Any>()

    @Test
    fun stringArrayListTest(){
        stringArrayList.add("Asep")
        stringArrayList.add("Jaya")

        println(stringArrayList[0])
        println(stringArrayList[1])
    }

    @Test
    fun covariantTest(){
        val covariantString = Covariant("Jajang")
        val covariantAny: Covariant<Any> = covariantString

        println(covariantAny.data())
    }

    @Test
    fun contraVariantTest(){
        val contravariantString: Contravariant<String> = contravariantAny
        contravariantString.sayHello("Maman")
    }
}