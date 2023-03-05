package com.lperthel.dynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniquePathsTest {
	private UniquePaths solution= new UniquePaths();
	@Test
	void test_Example1() {
		int m = 3;
		int n = 7;
		int expected = 28;
		int actual = solution.uniquePaths(m,n);
		assertEquals(expected,actual);
	}
	@Test
	void test_Example2() {
		int m = 3;
		int n = 2;
		int expected = 3;
		int actual = solution.uniquePaths(m,n);
		assertEquals(expected,actual);
	}
	
}
