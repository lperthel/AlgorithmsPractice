package com.lperthel.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class FindMinimumInRotatedSortedarrayTest {
	private Solution searchInRotatedSortedArray = new Solution();
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void testGivenRotatedArrayWithTargetOnRightSide_ExpectIndexOfTarget() {
		final int [] nums = {4,5,6,7,8,9,10,1,2,4};
		int expected = 1;
			assertEquals(expected,searchInRotatedSortedArray.findMin(nums));	
	}
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void testGivenRotatedArrayWithTargetOnLeftSide_ExpectIndexOfTarget() {
		final int [] nums = {8,9,10,1,2,3,4,5,6,7};
		int expected = 1;
			assertEquals(expected,searchInRotatedSortedArray.findMin(nums));	
	}		
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void  test_GivenTwoElementarray_ExpectRightElement () {
		final int [] nums = {3,1};
		int expected = 1;
			assertEquals(expected,searchInRotatedSortedArray.findMin(nums));	
	}
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void  test_GivenSingleElementArray_ExpectToOnlyFindSingleElement() {
		final int [] nums = {1};
		int expected = 1;
			assertEquals(expected,searchInRotatedSortedArray.findMin(nums));	
	}

	}