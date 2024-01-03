package dataClass

import kotlin.collections.List

class List {
    fun latihanList(){
        val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
        val numberList2 = listOf(1, 2, 3, 4, 5)
        val charList = listOf('a', 'b', 'c')
        val anyList = listOf('a', "Kotlin", 3, true)
        val anyList2 = mutableListOf('a', "Kotlin", 3, true)

        anyList2.add('d') // menambah item di akhir list
        anyList2.add(1, "love") // menambah item pada indeks ke-1
        anyList2[3] = false // mengubah nilai item pada indeks ke-3
        anyList2.removeAt(0) // menghapus item pada indeks ke-0
    }
}