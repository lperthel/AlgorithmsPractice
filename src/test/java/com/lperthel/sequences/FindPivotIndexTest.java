package com.lperthel.sequences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindPivotIndexTest {
private FindPivotIndex solution = new FindPivotIndex();
	@Test
	void test() {
		int[] input = {1,7,3,6,5,6};
		assertEquals(3,solution.pivotIndex(input));
	}

}
