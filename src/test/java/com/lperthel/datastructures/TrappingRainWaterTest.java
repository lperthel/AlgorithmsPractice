package com.lperthel.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TrappingRainWaterTest {
private Solution  solution = new Solution ();
	@Test
	void test_GivenVariableHeightTerran_ExpectAreaOfRain() {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int expected = 6;
		int actual = solution.trap(height);
				assertEquals(expected,actual);
	}

}
