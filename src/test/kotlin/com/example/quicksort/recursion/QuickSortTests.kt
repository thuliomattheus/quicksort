package com.example.quicksort.recursion

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class QuickSortTests {

	@Test
	fun test() {
		assertEquals(
			emptyList<Int>(),
			QuickSort.execute(emptyList())
		)
		assertEquals(
			listOf(3),
			QuickSort.execute(listOf(3))
		)
		assertEquals(
			listOf(9, 20),
			QuickSort.execute(listOf(9, 20))
		)
		assertEquals(
			listOf(4, 17),
			QuickSort.execute(listOf(17, 4))
		)
		assertEquals(
			listOf(4, 8, 17),
			QuickSort.execute(listOf(17, 8, 4))
		)
		assertEquals(
			listOf(2, 7, 19),
			QuickSort.execute(listOf(19, 2, 7))
		)
		assertEquals(
			listOf(2, 9, 40),
			QuickSort.execute(listOf(9, 2, 40))
		)
		assertEquals(
			listOf(1, 27, 52),
			QuickSort.execute(listOf(1, 27, 52))
		)
		assertEquals(
			listOf(2, 11, 12),
			QuickSort.execute(listOf(11, 12, 2))
		)
		assertEquals(
			listOf(1, 8, 27),
			QuickSort.execute(listOf(1, 27, 8))
		)
		assertEquals(
			listOf(8, 9, 10, 27),
			QuickSort.execute(listOf(10, 27, 8, 9))
		)
		assertEquals(
			listOf(3, 54, 80, 100),
			QuickSort.execute(listOf(54, 100, 80, 3))
		)
		assertEquals(
			listOf(3, 4, 6, 7, 9, 10, 11, 12),
			QuickSort.execute(listOf(7, 10, 9, 6, 4, 12, 11, 3))
		)
	}
}
