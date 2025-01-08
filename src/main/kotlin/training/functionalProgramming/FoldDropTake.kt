package training.functionalProgramming

import org.junit.Test

class FoldDropTake {
    fun foldDropTake() {
        // TODO 1
        // Lengkapi numbers dengan list 1,2,3
        // Lengkapi fold yang berisi fold dari number lalu cetak current dan itemnya dan gabungkan keduanya, dan cetak foldnya
        val numbers = 0
        val fold = numbers

        println(fold)

        // TODO 2
        // Lengkapi number berisi list 1..6
        // Gunakan `drop` untuk menghapus 3 elemen pertama dari list.
        // Gunakan `dropLast` untuk menghapus 3 elemen terakhir dari list.
        val number = 0
        val drop =  0
        val dropLast = 0

        println("DROP : $drop")
        println("DROP LAST : $dropLast")

        // TODO 4
        // Lengkapi total berisi 1..6
        // Gunakan `take` untuk mengambil 3 elemen pertama dari list.
        // Gunakan `takeLast` untuk mengambil 3 elemen terakhir dari list.
        val total = 0
        val take = 0
        val takeLast = 0

        println("TAKE : $take")
        println("TAKE LAST : $takeLast")
    }
}

class FoldDropTakeTesting {
    private val value = FoldDropTake()

    @Test
    fun testing() {
        value.foldDropTake()
    }
}
