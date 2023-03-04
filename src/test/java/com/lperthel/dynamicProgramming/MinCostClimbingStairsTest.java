package com.lperthel.dynamicProgramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinCostClimbingStairsTest {
	private Solution solution= new Solution();
	@Test
	void test_Example1() {
		int[] cost = {10,15,20};
		int expected = 15;
		int actual = solution.minCostClimbingStairs(cost);
		assertEquals(expected,actual);
	}
	@Test
	void test_Example2() {
		int[] cost = {1,100,1,1,1,100,1,1,100,1};
		int expected = 6;
		int actual = solution.minCostClimbingStairs(cost);
		assertEquals(expected,actual);
	}
}