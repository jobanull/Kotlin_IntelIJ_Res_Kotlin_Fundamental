package original.fundamental

import org.junit.Test

class Function{
    fun function(name: String, age : Int) : String{
        return "My name is $name, i'm $age years old"
    }
    fun function2(name : String, age : Int) = "My name is $name, i'm $age years old"
}


class FunctionTest{
    val function = Function()

    @Test
    fun functionTest1(){
        function.function2("Asep", 23)
    }

    fun functionTest2(){
        function.function2("Asep", 23)
    }
}