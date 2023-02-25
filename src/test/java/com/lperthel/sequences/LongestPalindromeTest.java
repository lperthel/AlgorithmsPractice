package com.lperthel.sequences;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LongestPalindromeTest {
	private Solution solution = new Solution();
	@Test
	void test() {
		String input = "abccgggccddaa";
		int expected =11;
		int actual = solution.longestPalindrome(input);
		assertEquals(expected,actual);
	}

}
