package com.example.quicksort.recursion

object QuickSort {

    fun execute(array: List<Int>): List<Int> {
        if (array.isEmpty()) {
            println("Tava vazio, não tem o que fazer")
            return emptyList()
        } else if (array.size == 1) {
            println("Retornando o único elemento ${array[0]}")
            return listOf(array[0])
        } else if (array.size == 2) {
            if (array[0] > array[1]) {
                println("Invertendo os valores ${array[1]} e ${array[0]}")
                return mutableListOf(array[1], array[0])
            } else {
                println("Retornando os valores ${array[0]} e ${array[1]}")
                return mutableListOf(array[0], array[1])
            }
        } else {
            val pivot = array[0]
            val lessThan = mutableListOf<Int>()
            val moreThan = mutableListOf<Int>()
            for (i in 1 until array.size) {
                if (array[i] <= pivot) {
                    lessThan.add(array[i])
                } else {
                    moreThan.add(array[i])
                }
            }
            println("Juntando o array de menores $lessThan com o pivô $pivot e com o array de maiores $moreThan")
            return execute(lessThan) + pivot + execute(moreThan)
        }
    }
}
