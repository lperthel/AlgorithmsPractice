package com.lperthel.sequences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> 	threeSum(int[] nums){
		List<List<Integer>>  matches = new ArrayList<>();
		Arrays.sort(nums);
		//P.t("nums = ", Arrays.toString(nums));
final int n = nums.length;
int i = 0;

while(i < n-2){
	//P.t("i = ",i );
//handle triple zero case
if(nums[i] == 0
		&& nums[i+1] == 0
		&& nums[i+2] == 0) {
	matches.add(Arrays.asList(0,0,0));
	while(i+2 < nums.length &&nums[i+2] == 0) {
		i++;
	}
	continue;
}

// avoid duplicates
if(nums[i] == nums[i+2]) {
	i++;
	continue;
}
//make two pointers
int left= i+1;
int right = n - 1;
while(left <right ) {
	//P.t("left = ",left );
	//P.t("right = ",right );
	if(left+ 2< nums.length && nums[left] == nums[left+2]) {
		left++;
		continue;
	}
	
	int sum = nums[i]+nums[left]+nums[right];
	//P.t("sum = ", sum);
	if( sum < 0)
		left ++;
	else if (sum == 0) {
	matches.add(Arrays.asList(nums[i], nums[left] ,nums[right]));
	//P.t("matches = ", matches);
	//avoid dups	
	if(nums[left] == nums[left+1]) 
			left = left+2;
		 else
		left++;
}
		else
			right--;
	}
	if(nums[i] == nums[i+1]) 
		i = i+2;
	 else
	i ++;

}
//P.t("exiting");
return matches;
	}
	
protected static class P{
public static void t(Object... args){
	for(Object elem:args) {		
		System.out.print(elem+ " ");
	}
	System.out.println();
}
}
	
	
}