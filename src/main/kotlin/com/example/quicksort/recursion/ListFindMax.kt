package com.example.quicksort.recursion

object ListFindMax {

    fun execute(numbers: List<Long>): Long =
        require(numbers.isNotEmpty()) {
            "The list should not be empty"
        }
            .run {
                if (numbers.size == 1)
                    numbers.last()
                else {
                    val last = numbers.last()
                    val next = execute(numbers.dropLast(1))

                    if (last > next)
                        last
                    else
                        next
                }
            }

}
