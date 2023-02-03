package com.lperthel.sequences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SearchinRotatedSortedArray {
private Solution solution = new Solution();
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGivenNonrotatedArrayWithExistingTarget_ExpectIndexOfTarget() {
		final int [] nums = {0,1,2,3,4,5,6,7,8,9};
		final int target = 4;
		final int expected = 4;
		int actual = solution.search(nums,  target);
		assertEquals(expected,actual);
	}


@Test
void testGivenRotatedArrayWithExistingTargetOnRightSide_ExpectIndexOfTarget() {
	final int [] nums = {5,6,7,8,9,0,1,2,4};
final int [] targets= {0,1,2,4};
	final int [] expecteds= {5,6,7,8};
	
	for(int i=0;i<targets.length;i++) {
		assertEquals(expecteds[i],solution.search(nums,  targets[i]));	
	}
}
} 