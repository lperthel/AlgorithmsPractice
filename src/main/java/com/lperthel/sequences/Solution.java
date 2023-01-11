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
	
public List<List<String>> threeSum(int[] nums){
ThreeSumMatch match = new ThreeSumMatch (nums[0],nums[1], nums[2]  );
ThreeSumMatch.addMatch(match);

return ThreeSumMatch.getSolutionOutPut();
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
