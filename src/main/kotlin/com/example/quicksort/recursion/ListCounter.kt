package com.example.quicksort.recursion

object ListCounter {

    fun execute(numbers: List<Long>): Long =
        when {
            numbers.isEmpty() -> 0
            else -> 1 + execute(numbers.drop(1))
        }
}
