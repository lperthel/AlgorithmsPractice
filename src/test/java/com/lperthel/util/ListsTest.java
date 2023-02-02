package com.lperthel.util;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListsTest {
	List<List<String>> mainList ;
	List<List<String>> subList;
	@BeforeEach
	void setUp() throws Exception {
		mainList = new ArrayList<>();
		subList= new ArrayList<>();
	}
	@Test
	void test_GivenSubLisExpectReverseDeepContainsAllFalse() {
		mainList.add(Arrays.asList("bat"));
		mainList.add(Arrays.asList("nat","tan"));
		mainList.add(Arrays.asList("ate","eat","tea"));
	subList.add(Arrays.asList("bat"));
	subList.add(Arrays.asList("nat"));
	subList.add(Arrays.asList("eat","tea","ate"));
	assert(Lists.deepContainsAll(mainList, subList));
	assertFalse(Lists.deepContainsAll(subList, mainList));
	}
	@Test
	void Test_GivenListsWithIdenticalelementsExpectDeepContainsTrue() {
		mainList .add(Arrays.asList("bat"));
		mainList .add(Arrays.asList("nat","tan"));
		mainList .add(Arrays.asList("ate","eat","tea"));
	subList.add(Arrays.asList("bat"));
	subList.add(Arrays.asList("tan","nat"));
	subList.add(Arrays.asList("eat","tea","ate"));
	assert(Lists.deepContainsAll(mainList, subList));
	assert(Lists.deepContainsAll(subList, mainList));
	}


}
