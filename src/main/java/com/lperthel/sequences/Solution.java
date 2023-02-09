package com.lperthel.sequences;

import java.util.Arrays;

public class Solution {
	
public int search(int[] nums, int target) {
	int n = nums.length;
	int left=0;
	int right= n-1;
	int pivot ;
	if(nums[0] > nums[n-1]){
		pivot =findPivot(left,right,nums);
		int binarySearchResultLeft = Arrays.binarySearch(nums,0, pivot+1,target);
		int binarySearchResultRight = Arrays.binarySearch(nums,pivot+1, n,target);
		binarySearchResultLeft  = Math.max(-1, binarySearchResultLeft );
return Math.max(binarySearchResultLeft, binarySearchResultRight);
	}
	int binarySearchResult = Arrays.binarySearch(nums,left, right+1,target);
	return Math.max(-1, binarySearchResult);
}
private int findPivot(int left, int right, int[] nums) {
	int mid= (left+right)/2;
	if(nums[mid]>nums[mid+1])
		return mid;
	else if(nums[mid]<nums[mid-1])return mid-1;
	else if(nums[left] < nums[mid])
		return findPivot(mid+1,right,nums);
	else
		return findPivot(left,mid-1,nums);
}
}