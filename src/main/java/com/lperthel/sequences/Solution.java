package com.lperthel.sequences;

import java.util.Arrays;

public class Solution {
	
public int search(int[] nums, int target) {
	int n = nums.length;
	boolean rotated = nums[0] > nums[n-1];
	int left=0;
	int right= n-1;
	
//		return -1;
	if(rotated ){
			while(true) {
			int avgIndex = (left+right)/2;
int 			leftElem = nums[left];
int rightElem = nums[right];
if(target <= nums[n-1]) {
	int backoffIndex=(2*left- right + left)/2;
			if(leftElem <=target ) {
				break;
			}else if(leftElem >rightElem && nums[left+1] > target && nums[left+1] <= rightElem) {
				left = -1;
				break;
			}else if(leftElem < nums[0] ) {
				left = backoffIndex-1;
		} else 
			left = avgIndex+1;
}else{
	int backoffIndex=(2*right- left + right)/2;
				if(rightElem>=target ) {
					break;
} else if(leftElem<rightElem && nums[right+1]<= nums[n-1]) {
	left = -1;
	break;
}else if(rightElem > nums[n-1]){
	right = backoffIndex+1;
} else {
	right = avgIndex-1;
}
			}
}
			}
	
	if(left == -1)
		return -1;
	int binarySearchResult = Arrays.binarySearch(nums,left, right+1,target);
	if(binarySearchResult < 0)
		binarySearchResult = -1;
	return binarySearchResult;
}

}