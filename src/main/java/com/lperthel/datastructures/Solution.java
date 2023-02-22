package com.lperthel.datastructures;

public class Solution {
    public int findMin(int[] nums) {
    	int left =0, mid, n = nums.length,  right = n-1;
    	while(left <right) {
	 mid = (left+right)/2;
	 if(mid+1 < n &&nums[mid]>nums[mid+1])
		 return nums[mid+1];
	 else if(mid -1 > 0 &&  nums[mid]<nums[mid-1])
		 return nums[mid];
	 else if(nums[mid] >nums[left]) {
		 left = mid +1;
	 } else 
		  right = mid-1;
	 
 }
    	return nums[0];       
    
}
}
