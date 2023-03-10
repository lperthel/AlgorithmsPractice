package com.lperthel.datastructures;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
	public int[] twoSum(int[] nums, int target){
		Map <Integer, Integer> map= new HashMap<>();
		for (int i = 0 ; i < nums.length ; i++)
		map.put(nums[i], i);
		for ( int i = 0; i < nums. length; i++) {
		int x = nums [i] ;
		Integer y = map.get (target-x);
		if (y  != null && y.intValue() != i) {
		int [] a = {i,y};
		return a ;
		}
		}
		return null;
	}
}