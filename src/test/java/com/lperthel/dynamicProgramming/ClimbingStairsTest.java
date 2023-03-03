package com.lperthel.dynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClimbingStairsTest {
	private Solution solution= new Solution();
	@Test
	void testFiveStairs() {
		int n = 5;
		int expected = 6;
		int actual = solution.climbStairs(n);
		assertEquals(expected,actual);
	}

}
