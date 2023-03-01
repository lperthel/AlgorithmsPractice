package com.lperthel.sequences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearchTest {
	private BinarySearch solution = new BinarySearch();

	@Test
	void testExample1() {
		int[] input = {-1,0,3,5,9,12 };
		int target = 0;
		int expected = 1;
		int actual = solution.search(input, target);
		assertEquals(expected,actual);
	}

}
