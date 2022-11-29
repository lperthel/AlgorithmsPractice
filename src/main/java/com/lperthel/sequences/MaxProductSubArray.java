package com.lperthel.sequences;

public final class MaxProductSubArray {

public int getIndexOfNextZeroOrEndOfArray(int startIndex, int[] nums) {
		
		int indexOfNextZeroOrEndOfArray  = -1;
		int i = 0;
		while(indexOfNextZeroOrEndOfArray != -1) {
if(nums[i] ==0) {
	indexOfNextZeroOrEndOfArray  = i;
}
	else if(i+1 == nums.length) {
		indexOfNextZeroOrEndOfArray = nums.length; 
}
}
	
	return indexOfNextZeroOrEndOfArray ;
	}

	
}
