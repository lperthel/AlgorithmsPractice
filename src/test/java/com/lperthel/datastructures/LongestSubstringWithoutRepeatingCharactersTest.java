package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {
private Solution solution = new Solution();
	@Test
	void test_GivenStringWithLongestSubstringLengthThree_ExpectThree() {
		String input = "abcabcbb";
		int expected = 3;
		int actual = solution.lengthOfLongestSubstring(input);
		assertEquals(expected,actual);
	}

}
