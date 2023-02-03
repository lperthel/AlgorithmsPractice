package com.lperthel.sequences;

import java.util.Arrays;

public class Solution {
public int search(int[] nums, int target) {
	int n = nums.length;
	boolean rotated = nums[0] > nums[n-1];
	int left=0;
	int right= n-1;
	boolean foundBound = false;
	if(rotated && target < nums[0]) {
		while(!foundBound) {
int 			leftElem = nums[left];
			int rightElem = nums[right];
			int avgElem 		= nums[(leftElem+rightElem )/2];
			if(leftElem == target) {
				foundBound = true;
			}
			else if(leftElem >rightElem && avgElem >target) {
		left = avgElem;	}
				
		}
	} else {
		left = 0;
		right = n;
	}
return Arrays.binarySearch(nums,left, right,target);
}
protected static class P{
	 public static void t(Object... args){

		 for(Object elem:args) {		
	 		System.out.print(elem+ " ");
	 	}
	 	System.out.println();
	 }
	 public static void t(Object str, Object[]... args){
		 System.out.print(str);
		 for(Object elem:args) {		
	 		System.out.print(elem+ " ");
	 	}
	 	System.out.println();
	 }
}
}

