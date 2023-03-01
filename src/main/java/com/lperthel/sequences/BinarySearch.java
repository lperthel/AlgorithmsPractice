package com.lperthel.sequences;

class BinarySearch{
    public int search(int[] nums, int target) {
    	int left = 0, right = nums.length -1, mid;
    	if(nums[left] == target)
    		return left;
    	else if(nums[right] == target)
    		return right;
//    	if(target < nums[0] || target > nums[right])
//    		return -1;   	
    				while(left<=right) {
    		mid = (left + right)/2;
    		if(nums[mid] == target)
    			return mid;
    		else if(nums[mid]<target)
    			left = mid +1;
    		else right = mid-1;
    	}
    		return -1;
    }
}