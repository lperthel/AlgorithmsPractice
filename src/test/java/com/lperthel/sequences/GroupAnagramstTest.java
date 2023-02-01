package com.lperthel.sequences;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GroupAnagramstTest {
private Solution solution = new Solution();
private List<List<String>> expected;
private List<List<String>> actual;

	@BeforeEach
	void setUp() throws Exception {
expected= new LinkedList<>();
		actual = null;
		
	}

	@Test
	void test_GivenGroupOfAnagrams_ExpectGroupedAnagrams() {
		String[] anagrams = { "eat","tea","tan","ate","nat","bat"};
	expected .add(Arrays.asList("bat"));
	expected .add(Arrays.asList("nat","tan"));
	expected .add(Arrays.asList("ate","eat","tea"));
		actual = solution.groupAnagrams(anagrams);
assertEquals(expected, actual); 
	}

}
