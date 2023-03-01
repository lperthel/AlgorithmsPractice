package com.lperthel.sequences;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class FirstBadVersionTest {
private Solution solution = new Solution();
	@Test
	void testExample1() {
		int n = 5;
		int expected = 4;
		solution.bad = expected;

		int actual = solution.firstBadVersion(n);
		assertEquals(expected,actual);
		
	}

}
