package dataClass

import org.junit.Test

class Map {
    fun mapTest(){
        val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
        )

        println(capital["Jakarta"])
        println(capital.getValue("Jakarta"))
        val mapKeys = capital.keys
        val mapValues = capital.values
        println(mapKeys)
        println(mapValues)

        val mutableCapital = capital.toMutableMap()
        mutableCapital["Amsterdam"] = "Netherlands"
        mutableCapital.put("Berlin", "Germany")

        println(mutableCapital["Amsterdam"])
        println(mutableCapital.keys)
        println(mutableCapital.getValue("Amsterdam"))
    }
}

class MapTest{
    private val map = Map()
    @Test
    fun mapTest(){
        map.mapTest()
    }
}