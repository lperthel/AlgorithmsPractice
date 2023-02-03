package com.lperthel.sequences;

import java.util.Arrays;

public class Solution {
public int search(int[] nums, int target) {
	int n = nums.length;
return Arrays.binarySearch(nums,0, n,target);
    }
}
