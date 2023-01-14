	package com.lperthel.sequences;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.lperthel.util.Printer.print;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Solution {	
public List<List<String>> threeSum(int[] nums){
	Arrays.sort(nums);
	int pivot;
	try {
		pivot = findPivot (nums);
print("pivot = ", pivot);
	}catch(IllegalArgumentException e) {
		print("array has no pivot");
		return ThreeSumMatch.getSolutionOutPut(); 
	}
	
	var possibleMatch = new ThreeSumMatch ();
	
			possibleMatch.setSmallestNum(nums[0]);;
			print("possibleMatch = " ,possibleMatch);
			for(int j=nums.length-1;j>=pivot;j-- ){
		possibleMatch.setLargestNum(nums[j]);
		print("possibleMatch = " ,possibleMatch);
		print("j= " ,j);
		int foundIndex = Arrays.binarySearch(nums,1,j,possibleMatch.calcMisngNum());
		print("foundIndex= " ,foundIndex );
		if(foundIndex  > 0) {
			possibleMatch.setMiddleNum(nums[foundIndex]);
			print("foundMatch = " ,possibleMatch);
			ThreeSumMatch.addMatch(possibleMatch);
			break;
		}
	}
	print("threesums =",ThreeSumMatch.getSolutionOutPut());
		return ThreeSumMatch.getSolutionOutPut();
}
private int findPivot(int[] nums) {
	int i;
	
	for(i=0;i<nums.length;i++ ){
		if(nums[i +1 ]==0)
break;
		else if(i+1 < nums.length && nums[i]<0 && nums[i+1] > 0)
			break;
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
threeSums.clear();
	 }
	public int calcMisngNum() { 
		return Math.negateExact(smallestNum+largestNum);
	}

	public static boolean addMatch(ThreeSumMatch match){
return  threeSums.add((match));
	 }
 private List<String> toStringList(){		
 return Arrays.asList(""+smallestNum, ""+middleNum,""+largestNum);
	}
	public static List<List<String>>  getSolutionOutPut() {
return threeSums.stream().map(e-> e.toStringList()) .collect(Collectors.toList());
	}
	
}

}
