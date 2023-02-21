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
	@Test
	void test_GivenStringWithLongestSubstringLengthThreeAndFourUniqueChars_ExpectThree() {
		String input = "pwwkew";
		int expected = 3;
		int actual = solution.lengthOfLongestSubstring(input);
		assertEquals(expected,actual);
	}
	
	@Test
	void test_GivenSingleRepeatingCharacter_ExpectLengthOne() {
		String input = "bbbbb";
		int expected = 1;
		int actual = solution.lengthOfLongestSubstring(input);
		assertEquals(expected,actual);
	}

}
