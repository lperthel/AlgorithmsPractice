package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {
private ContainerWithMostWater solution = new ContainerWithMostWater();
	@Test
	void test_GivenVariableHeightContainer_ExpectMaxArea() {
		final int[] height = {1,8,6,2,5,4,8,3,7};
		final int expected = 49;
		int actual = solution.maxArea(height);
		assertEquals(expected,actual);
	}

}
