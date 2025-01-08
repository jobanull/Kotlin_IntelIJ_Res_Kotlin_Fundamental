package training.fundamental

import org.junit.Test

class StringTemplate {

    // TODO 1
    // Buat fungsi stringTemplate yang meminta parameter name dan age dan mengembalikan string
    // Gunakan string template untuk mengembalikan kalimat "My name is $name, i'm $age years old".

}

class StringTemplateTest {
    val stringTemplate = StringTemplate()
    @Test
    fun stringTemplateTest() {
        val value = stringTemplate
        println(value)
    }
}