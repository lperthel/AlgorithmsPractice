package com.lperthel.sequences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsSubsequenceTest {
private Solution solution = new Solution();
	@Test
	void test_GivenSubsequenceString_ExpectTrue() {
		String t = "abcde";
		String s = "ace";
		assertTrue(solution.isSubsequence(s,t));
	}
	@Test
	void test_GivenNonSubsequenceString_ExpectFalse() {
		String t = "abcde";
		String s= "aecs";
		assertFalse(solution.isSubsequence(s,t));
	}

}
