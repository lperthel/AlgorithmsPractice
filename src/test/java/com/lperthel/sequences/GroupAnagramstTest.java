package com.lperthel.sequences;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lperthel.util.Lists;

class GroupAnagramstTest {
private GroupAnagrams groupAnagrams = new GroupAnagrams();
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
		actual = groupAnagrams.groupAnagrams(anagrams);
		assert(Lists.deepContainsAll(actual, expected));
		assert(Lists.deepContainsAll(expected, actual));
	}
	
	@Test
	void 	ttestGivenEmptyStringArray_ExpectListOfListEmptyString() {
		String[] anagrams = {""}; 
	expected .add(Arrays.asList(""));
		actual = groupAnagrams.groupAnagrams(anagrams);
		assert(Lists.deepContainsAll(actual, expected));
		assert(Lists.deepContainsAll(expected, actual));
	}

	@Test
	void 	TestGivenNonAnagramsWithIdenticalAnagramKeysExpectDifferentAnagramGroups() {
		String[] anagrams = {"bdddddddddd", "bbbbbbbbbbc"}; 
	expected .add(Arrays.asList("bdddddddddd"));
	expected .add(Arrays.asList("bbbbbbbbbbc"));
		actual = groupAnagrams.groupAnagrams(anagrams);
		assert(Lists.deepContainsAll(actual, expected));
		assert(Lists.deepContainsAll(expected, actual));
	}
}
