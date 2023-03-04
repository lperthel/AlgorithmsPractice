package com.lperthel.dynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClimbingStairsTest {
	private ClimbingStairs solution= new ClimbingStairs();
	@Test
	void test_Given5Stairs_Expect8Ways() {
		int n = 5;
		int expected = 8;
		int actual = solution.climbStairs(n);
		assertEquals(expected,actual);
	}
	@Test
	void test_GivenFourStairs_Expect5Ways() {
		int n = 4;
		int expected = 5;
		int actual = solution.climbStairs(n);
		assertEquals(expected,actual);
	}

}
