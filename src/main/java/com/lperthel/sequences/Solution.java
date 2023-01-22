	package com.lperthel.sequences;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {	
public List<List<Integer>> 	threeSum(int[] nums){
		List<List<Integer>>  matches = new ArrayList<>();
			Arrays.sort(nums);
		Printer1.print("nums= " ,Arrays.toString(nums));
		int i = 0;
		while(i < nums.length - 2){
			int j;
			if(nums[i] == nums[i+2]) { 
				i++;
				continue;
			}
				Printer1.print("i= " ,i, ", nums[i] = ", nums[i]);
				j = i+1;
				while(j < nums.length -1){
					if(j + 2< nums.length & nums[j] == nums[j+2]) {
						j=j+2;
						continue;
					}
					Printer1.print("j= " ,j,  ", nums[j] = ", nums[j]);
			int k= Arrays.binarySearch(nums,j + 1,nums.length,Math.negateExact(nums[i]+nums[j]));
			if(k> 0) {
				matches.add(Arrays.asList(nums[i],nums[j],nums[k]));
				Printer1.print("matches = ",matches);
			}
			if(j +2 == nums.length) {
				Printer1.print(" j too big. ending loop. j = ", j);
				break;
}
				j = j+2;
				Printer1.print(" Iterating j. j = ",j);
		}
				i = i+2;
				Printer1.print(" Iterating i. i = ",i);
		}
		return matches;
	}
protected static class Printer1 {
public static void print(Object... args){
	for(Object elem:args) {
		System.out.print(elem+ " ");
	}
	System.out.println();
}
}
	

}