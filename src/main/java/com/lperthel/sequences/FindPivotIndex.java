package com.lperthel.sequences;

import java.util.Arrays;

class FindPivotIndex {
    public int pivotIndex(int[] nums) {
int rightSum =Arrays.stream(nums).sum();
int leftSum = 0;
for(int i = 0;i<nums.length;i++) {
	leftSum += nums[i];
	if(leftSum == rightSum)
		return i;
	else rightSum -= nums[i];
}
    	return -1;        
    }
}