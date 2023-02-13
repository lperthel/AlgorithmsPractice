package com.lperthel.sequences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class SearchinRotatedSortedArrayTest {
private SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS)
void testGivenRotatedArrayWithTargetOnRightSide_ExpectIndexOfTarget() {
	final int [] nums = {5,6,7,8,9,0,1,2,4};
final int [] targets= {-1,0,1,2,3,4};
final int [] expecteds= {-1,5,6,7,-1,8};
	
	for(int i=0;i<targets.length;i++) {
		assertEquals(expecteds[i],searchInRotatedSortedArray.search(nums,  targets[i]));	
	}
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS)
void testGivenRotatedArrayWithTargetOnLeftSide_ExpectIndexOfTarget() {
	final int [] nums = {5,6,7,9,-1,0,1,2,3};
final int [] targets= {4,5,6,7,8,9,10};
final int [] expecteds= {-1, 0,1,2,-1,3,-1};
	for(int i=0;i<targets.length;i++) {
		assertEquals(expecteds[i],searchInRotatedSortedArray.search(nums,  targets[i]));	
	}
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS)
void  testGiven2ElementArrayWithNonExistanTarget_ExpectNegativeOne() {
	final int [] nums = {3,1};
	final int [] targets= {3,1,0,2,4};
	int [] expecteds= {0,1,-1,-1,-1};
	for(int i=0;i<targets.length;i++) {
		assertEquals(expecteds[i],searchInRotatedSortedArray.search(nums,  targets[i]));	
	}
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS)
void  test_GivenSingleElementArray_ExpectToOnlyFindSingleElement() {
	final int [] nums = {1};
	final int [] targets= {1,0,2};
	int [] expecteds= {0,-1,-1,};
	for(int i=0;i<targets.length;i++) {
		assertEquals(expecteds[i],searchInRotatedSortedArray.search(nums,  targets[i]));	
	}
}

}