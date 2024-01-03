package dataClass

class Set {
    fun latihanSet(){
        val integerSet = setOf(1, 2, 4, 2, 1, 5)
        println(integerSet)

        val setA = setOf(1, 2, 4, 2, 1, 5)
        val setB = setOf(1, 2, 4, 5)
        println(setA == setB)
        print(5 in setA)

        val setC = setOf(1, 5, 7)
        val union = setA.union(setC)
        val intersect = setA.intersect(setC)

        println(union)
        println(intersect)

        val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
        mutableSet.add(6)
        mutableSet.remove(1)
    }
}