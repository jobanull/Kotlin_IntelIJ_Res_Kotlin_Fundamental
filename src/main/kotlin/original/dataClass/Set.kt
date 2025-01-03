package original.dataClass

import org.junit.Test

class Set {
    fun setTest(){
        val integerSet = setOf(1, 2, 4, 2, 1, 5)
        println("INTEGER SET : $integerSet")

        val setA = setOf(1, 2, 4, 2, 1, 5)
        val setB = setOf(1, 2, 4, 5)
        println(setA == setB)
        print(5 in setA)

        val setC = setOf(1, 5, 7)
        val union = setA.union(setC)
        val intersect = setA.intersect(setC)

        println("UNION : $union")
        println("INTERSECT : $intersect")

        val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
        mutableSet.add(6)
        mutableSet.remove(1)
    }
}

class SetTest{
    private val set = Set()

    @Test
    fun setTest(){
        set.setTest()
    }

}