package com.lperthel.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacementTest {
private LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
	@Test
	void testExample1() {
		String input = "AABABBA";
		int k = 1;
		int expected = 4;
		int actual = solution.characterReplacement(input, k);
		assertEquals(expected,actual);
	}
	@Test
	void testExampleCustom() {
		String input = "DFNXTBBAABGC";
		int k = 2;
		int expected = 5;
		int actual = solution.characterReplacement(input, k);
		assertEquals(expected,actual);
	}

}
