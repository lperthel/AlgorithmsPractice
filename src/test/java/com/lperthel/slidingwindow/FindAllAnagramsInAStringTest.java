package com.lperthel.slidingwindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FindAllAnagramsInAStringTest {
private FindAllAnagramsInAString solution = new FindAllAnagramsInAString();
	@Test
	void testExample1() {
		String s = "cbaebabacd", p = "abc";;
		List<Integer> expected = Arrays.asList(0,6);
		List<Integer> actual= solution.findAnagrams(s, p);
		assertEquals(expected,actual);
	}
	@Test
	void testExample2() {
		String s = "abab", p = "ab";
		List<Integer> expected = Arrays.asList(0,1,2);
		List<Integer> actual= solution.findAnagrams(s, p);
		assertEquals(expected,actual);
	}

}
