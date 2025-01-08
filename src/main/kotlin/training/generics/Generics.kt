package training.generics

import org.junit.Test

interface List<P> {
    operator fun get(index: Int): P
}

class ArrayList<T> : List<T> {
    // TODO 1
    // Buat elemen mutableList untuk menyimpan data elemen ArrayList.
    private val elements: MutableList<T> = mutableListOf()

    // TODO 2
    // Implementasikan fungsi get untuk mengakses elemen berdasarkan index.
    override fun get(index: Int): T {
        return elements[index]
    }

    // TODO 3
    // Tambahkan fungsi untuk menambahkan elemen baru ke ArrayList.
    fun add(element: T) {
        elements.add(element)
    }
}

// Covariant
class Covariant<out T>(val data: T) {
    // TODO 4
    // Buat fungsi untuk mengembalikan data yang ada dalam covariant.
    fun data(): T {
        return data
    }
}

// Contravariant
class Contravariant<in T> {
    // TODO 5
    // Buat fungsi untuk mencetak "Hello" diikuti dengan data dari parameter yang diberikan.
    fun sayHello(param: T) {
        println("Hello $param")
    }
}

class GenericsTest {
    // TODO 6
    // Buat ArrayList bertipe String.
    private val stringArrayList = ArrayList<String>()

    // TODO 7
    // Buat Contravariant bertipe Any.
    private val contravariantAny = Contravariant<Any>()

    @Test
    fun stringArrayListTest() {
        // TODO 8
        // Tambahkan elemen bertipe String ke dalam ArrayList.
        stringArrayList.add("Asep")
        stringArrayList.add("Jaya")

        // TODO 9
        // Akses dan cetak elemen ArrayList berdasarkan indeks.
        println(stringArrayList[0])
        println(stringArrayList[1])
    }

    @Test
    fun covariantTest() {
        // TODO 10
        // Buat instance Covariant bertipe String dan ubah referensinya ke Covariant bertipe Any.
        val covariantString = Covariant("Jajang")
        val covariantAny: Covariant<Any> = covariantString

        // TODO 11
        // Akses dan cetak data dari Covariant bertipe Any.
        println(covariantAny.data())
    }

    @Test
    fun contraVariantTest() {
        // TODO 12
        // Ubah referensi Contravariant bertipe Any ke Contravariant bertipe String.
        val contravariantString: Contravariant<String> = contravariantAny

        // TODO 13
        // Panggil fungsi sayHello pada Contravariant bertipe String.
        contravariantString.sayHello("Maman")
    }
}
