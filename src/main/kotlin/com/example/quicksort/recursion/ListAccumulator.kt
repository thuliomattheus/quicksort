package com.example.quicksort.recursion

object ListAccumulator {

    fun execute(numbers: List<Long>): Long =
        when {
            numbers.isEmpty() -> 0
            else -> numbers.last() + execute(numbers.dropLast(1))
        }
}
