package com.lperthel.sequences;

import java.util.Arrays;

public class Solution {
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
	private void printElems(int leftElem, int rightElem) {
		P.t("leftElem = ", leftElem );
					P.t("rightElem = ", rightElem );
	}
	private void printBounds(int left, int right, int avgIndex, int backoffIndex) {
		P.t("left= ", left);
		P.t("right= ", right);
		P.t("avgIndex= ", avgIndex);
		P.t("backoffIndex= ", backoffIndex);		;
	}

public int search(int[] nums, int target) {
	int i = 0;
	P.t("nums= ", Arrays.toString(nums));
	P.t("target= ", target);
	int n = nums.length;
	boolean rotated = nums[0] > nums[n-1];
	int left=0;
	int right= n-1;
	
	if(target == nums[left])
		return left;
	else if(target == nums[right])
		return right;
//	else if(target< nums[0] && target> nums[n-1])
//		return -1;
	else if(rotated ){
		
//		while(i<15) {
			while(true) {
			P.t("i =", i);
			i++;
			int avgIndex = (left+right)/2;
int 			leftElem = nums[left];
int rightElem = nums[right];
if(target < nums[0]) {
	P.t("branch a");;
	int backoffIndex=(2*left- right + left)/2;
	printBounds(left, right, avgIndex, backoffIndex);
	printElems(leftElem, rightElem);
			if(leftElem <=target ) {
				P.t("Found left bound at index", left);
				break;
			}else if(leftElem >rightElem && nums[left+1] > target && nums[left+1] <= rightElem) {
				P.t("target does not exist");
				left = -1;
				break;
			}else if(leftElem < nums[0] ) {
				P.t("backing off");	
				left = backoffIndex-1;
		} else 
			left = avgIndex+1;
			P.t("increasing avgIndex");
}else{
	P.t("branchba");;
	int backoffIndex=(2*right- left + right)/2;
	printBounds(left, right, avgIndex, backoffIndex);
				printElems(leftElem, rightElem);
				if(rightElem>=target ) {
					P.t("Found right bound at index", right);
					break;
} else if(leftElem<rightElem && nums[right+1] < target && nums[right+1]<rightElem) {
	P.t("target does not exist");
	left = -1;
	break;

}else if(rightElem > nums[n-1]){
	right = backoffIndex+1;
	P.t("backing off");
} else {
	right = avgIndex-1;
	P.t("increasing right index to avgIndex");
}
			}
}
			}
	
	if(left == -1)
		return -1;
if(i>15)
	throw new RuntimeException("inf loop detected");
	int binarySearchResult = Arrays.binarySearch(nums,left, right+1,target);
	if(binarySearchResult < 0)
		binarySearchResult = -1;
	return binarySearchResult;
}

}