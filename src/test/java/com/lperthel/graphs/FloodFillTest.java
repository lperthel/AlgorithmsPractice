package com.lperthel.graphs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FloodFillTest {
private FloodFill solution = new FloodFill();
	@Test
	void testExample1() {
		int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
		int[][] expected= {{2,2,2},{2,2,0},{2,0,1}};
		int color =2;
		int[][]  actual = solution.floodFill(image,1,1,color);
		assertEquals(Arrays.deepToString(expected),Arrays.deepToString(actual));
	}

}
