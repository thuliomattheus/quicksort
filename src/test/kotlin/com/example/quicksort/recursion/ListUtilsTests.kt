package com.example.quicksort.recursion

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ListUtilsTests {

	@Test
	fun sum() {
		assertEquals(0,     ListAccumulator.execute(emptyList()))
		assertEquals(12,    ListAccumulator.execute(listOf(2, 4, 6)))
		assertEquals(-2,    ListAccumulator.execute(listOf(-2)))
		assertEquals(71,    ListAccumulator.execute(listOf(23, 48)))
	}

	@Test
	fun count() {
		assertEquals(0,     ListCounter.execute(emptyList()))
		assertEquals(3,     ListCounter.execute(listOf(2, 4, 6)))
		assertEquals(1,     ListCounter.execute(listOf(-2)))
		assertEquals(2,     ListCounter.execute(listOf(23, 48)))
	}

	@Test
	fun findMax() {
		assertThrows<IllegalArgumentException> { ListFindMax.execute(emptyList()) }
		assertEquals(100,   ListFindMax.execute(listOf(2, 4, 6, 8, 100, 32)))
		assertEquals(1,     ListFindMax.execute(listOf(-20, 1, -10)))
		assertEquals(48,    ListFindMax.execute(listOf(23, 48, 38)))
	}
}
