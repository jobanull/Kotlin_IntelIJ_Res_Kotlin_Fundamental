package original.dataClass

import org.junit.Test

data class DataClassUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

class DataClass(val name : String, val age : Int){
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DataClass

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}



class DataClassTest{
    val dataClassUser1 = DataClassUser("Asep", 20)
    val dataClassUser2 = DataClassUser("Asep", 20)
    val dataClassUser3 = DataClassUser("Asep", 20)
    val dataClass1 = DataClass("Jajang", 20)
    val dataClass2 = DataClass("Jajang", 20)
    val dataClass3 = DataClass("Asep", 20)

    @Test
    fun dataClassTest(){
        println(dataClassUser1 == dataClassUser2)
        println(dataClassUser1 == dataClassUser3)
        println(dataClass1 == dataClass2)
        println(dataClass1 == dataClass3)
    }
}