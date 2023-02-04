package com.lperthel.sequences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class SearchinRotatedSortedArray {
private Solution solution = new Solution();
	@BeforeEach
	void setUp() throws Exception {
	}

@Test
@Timeout(value = 50, unit = TimeUnit.MILLISECONDS)
void testGivenRotatedArrayWithTargetOnRightSide_ExpectIndexOfTarget() {
	final int [] nums = {5,6,7,8,9,0,1,2,4};
final int [] targets= {-1,0,1,2,3,4};
final int [] expecteds= {-1,5,6,7,-1,8};
	
	for(int i=0;i<targets.length;i++) {
		assertEquals(expecteds[i],solution.search(nums,  targets[i]));	
	}
}
@Test
@Timeout(value = 50, unit = TimeUnit.MILLISECONDS)
void testGivenRotatedArrayWithTargetOnLeftSide_ExpectIndexOfTarget() {
	final int [] nums = {5,6,7,9,0,1,2,3,3};
final int [] targets= {5,6,7,9,4};
final int [] expecteds= {0,1,2,-1,3,-1};
	
	for(int i=0;i<targets.length;i++) {
		assertEquals(expecteds[i],solution.search(nums,  targets[i]));	
	}
}

} 