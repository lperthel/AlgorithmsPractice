	package com.lperthel.sequences;



import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Solution {	
public List<List<Integer>> threeSum(int[] nums){
	
	int pivot;
	Arrays.sort(nums);
	Printer1.print("nums= " ,Arrays.toString(nums));
	try {
		pivot = findPivot (nums);
		Printer1.print("pivot = ", pivot);
	}catch(IllegalArgumentException e) {
		Printer1.print("array has no pivot");
		return ThreeSumMatch.getSolutionOutPut(); 
	}
	findThreeSums(nums, pivot);
		return ThreeSumMatch.getSolutionOutPut();
}
/**
 * @param nums
 * @param pivot
 */
private void findThreeSums(int[] nums, int pivot) {
	var possibleMatch = new ThreeSumMatch ();
	for(int i = 0;i<=pivot;i++){
			possibleMatch.setSmallestNum(nums[i]);
			Printer1.print("i= " ,i);
			Printer1.print("possibleMatch = " ,possibleMatch);
			for(int j=nums.length-1;j>pivot;j-- ){
		possibleMatch.setLargestNum(nums[j]);
		Printer1.print("possibleMatch = " ,possibleMatch);
		Printer1.print("j= " ,j);
		int foundIndex = Arrays.binarySearch(nums,i+1,j,possibleMatch.calcMisngNum());
		Printer1.print("foundIndex= " ,foundIndex );
		if(foundIndex  > 0) {
			possibleMatch.setMiddleNum(nums[foundIndex]);
			Printer1.print("foundMatch = " ,possibleMatch);
			ThreeSumMatch.addMatch(possibleMatch);			possibleMatch = new ThreeSumMatch ();
			possibleMatch.setSmallestNum(nums[i]);
		}
	}
	}
}
private int findPivot(int[] nums) {
	int i;
	
	for(i=0;i<nums.length;i++ ){
		if(nums[i ]==0)
break;
		else if(i+1 < nums.length && nums[i]<0 && nums[i+1] > 0) {
			i++;
			break;
		}
	}
	if(i == nums.length)
			throw new IllegalArgumentException();
	return i;
}


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor 
@EqualsAndHashCode
@ToString
public static class ThreeSumMatch{
	private static Set<ThreeSumMatch> threeSums = new HashSet<>(); 
	private int smallestNum;
	private int middleNum;
	private int largestNum;
	public static void clearMatches(){
threeSums = new HashSet<>();
	 }
	public int calcMisngNum() { 
		return Math.negateExact(smallestNum+largestNum);
	}

	public static boolean addMatch(ThreeSumMatch match){
return  threeSums.add((match));
	 }
 private List<Integer> toIntegerList(){		
 return Arrays.asList(smallestNum, middleNum, largestNum);
	}
	public static List<List<Integer>>  getSolutionOutPut() {
		List<List<Integer>>   answer =		threeSums.stream().map(e-> e.toIntegerList()) .collect(Collectors.toList());
		Printer1.print("answer ", answer);
		clearMatches();
		return answer;
	}
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