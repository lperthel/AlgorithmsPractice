package com.lperthel.sequences;

import java.util.Arrays;

public class Solution {
public int search(int[] nums, int target) {
	P.t("nums= ", Arrays.toString(nums));
	P.t("target= ", target);
	int n = nums.length;
	boolean rotated = nums[0] > nums[n-1];
	int left=0;
	int right= n-1;
	boolean foundBound = false;
	if(target == nums[left])
			return left;
	else if(target == nums[right])
		return right;
	else if(rotated && target < nums[0]) {
		while(!foundBound) {
			int avgIndex = (left+right)/2;
			int backoffIndex=((2*left- right) + left)/2;
			printBounds(left, right, avgIndex, backoffIndex);
int 			leftElem = nums[left];
int rightElem = nums[right];
int avgElem 		= nums[avgIndex];
printElems(leftElem, rightElem, avgElem);
			if(leftElem <=target ) {
				P.t("Found bound at index", left);
				foundBound = true;
			}else if(target < leftElem && leftElem < nums[0] ) {
					left = backoffIndex;
		} else {
			left = avgIndex;
		}
			}
	} 
return Arrays.binarySearch(nums,left, right,target);
}
private void printElems(int leftElem, int rightElem, int avgElem) {
	P.t("leftElem = ", leftElem );
				P.t("rightElem = ", rightElem );
				P.t("avgElem 		= ", avgElem 		);
}
private void printBounds(int left, int right, int avgIndex, int backoffIndex) {
	P.t("left= ", left);
	P.t("right= ", right);
	P.t("avgIndex= ", avgIndex);
	P.t("backoffIndex= ", backoffIndex);		;
}
protected static class P{
	 public static void t(Object... args){

		 for(Object elem:args) {		
	 		System.out.print(elem+ " ");
	 	}
	 	System.out.println();
	 }
	 public static void t(Object str, Object[]... args){
		 System.out.print(str);
		 for(Object elem:args) {		
	 		System.out.print(elem+ " ");
	 	}
	 	System.out.println();
	 }
}
}

