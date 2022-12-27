package com.lperthel.sequences;

import java.util.Arrays;

public final class Solution {

	public int maxProduct(int[] nums) {
	
int startIndex = 0;
int endIndex; 
int maxProduct = Integer.MIN_VALUE;
int subArrayProduct;
boolean arrayHasZeroAsAnElement = false;
if(nums.length ==1) {
	return nums[0];
}

	while(startIndex < nums.length){
endIndex =getIndexOfNextZeroOrEndOfArray(startIndex, nums);
//System.out.printf("endIndex = %d%n",endIndex);
if(endIndex < nums.length) {
	arrayHasZeroAsAnElement = true;
}
subArrayProduct = findMaxProductWithinArrayBounds(startIndex, endIndex, nums);
 if(maxProduct < subArrayProduct) {
	 maxProduct =subArrayProduct; 
 }
 startIndex = endIndex +1;
 }

if(arrayHasZeroAsAnElement && maxProduct < 0) {
	
	maxProduct = 0;
}
System.out.printf("exiting program with maxProduct = %d%n", maxProduct);
return maxProduct;
	}
	
	public int findMaxProductWithinArrayBounds(int startIndex, int endIndex, int[] nums) {
		
		int prefixProduct = 1;
		int suffixProduct = 1;
		int maxProduct;
		int currentElement;
		String numsToString = Arrays.toString(nums);
		
		System.out.println(numsToString);
		
		//calculate the product of the entire array to cover the case of an even number of negative numbers )including 0)
		for(int i = startIndex; i<endIndex;i++) {
			currentElement = nums[i];
			suffixProduct *= nums[i];
			System.out.printf("i = %d, currentElement = %d, suffixProduct = %d%n", i,currentElement, suffixProduct);
		}
		maxProduct = suffixProduct;
		for(int i = startIndex; i<endIndex;i++) {
			currentElement = nums[i];
			System.out.printf("maxProduct = %d%n", maxProduct);
			if(currentElement > maxProduct) {
				maxProduct = currentElement;
				System.out.println("current Element is greater than max product.");
			}
			suffixProduct /= currentElement;
			System.out.printf("new suffixProduct = %d%n", suffixProduct);
			if( suffixProduct> maxProduct  && i+1 !=endIndex) {
				maxProduct = suffixProduct;
				System.out.println("Suffix product is greater than max prudct");
			System.out.printf("new max product = %d%n", maxProduct);
		}
			if(prefixProduct > maxProduct && i !=startIndex) {
				maxProduct = prefixProduct ;
				System.out.println("prefixproduct is greater than max prudct");
			}				
				prefixProduct *= currentElement;
				System.out.printf("new prefixProduct  = %d%n", prefixProduct);
	
		}
		return maxProduct;
	}
	
public int getIndexOfNextZeroOrEndOfArray(int startIndex, int[] nums) {
		
		int indexOfNextZeroOrEndOfArray  = -1;
//		System.out.printf("running getIndexOfNextZeroOrEndOfArray: startIndex = %d, nums %s%n",startIndex ,Arrays.toString(nums));
		int i = startIndex;
		while(indexOfNextZeroOrEndOfArray == -1) {
if(nums[i] ==0) {
	indexOfNextZeroOrEndOfArray  = i;
//	System.out.printf("nums[%d] =0.indexOfNextZeroOrEndOfArray = %d%n", i, indexOfNextZeroOrEndOfArray  );
}
	else if(i+1 == nums.length) {
		indexOfNextZeroOrEndOfArray = nums.length; 
//		System.out.printf("nums%di] =nums.length.indexOfNextZeroOrEndOfArray = %d%n",i,  indexOfNextZeroOrEndOfArray  );
	}
i++;
}
//		System.out.printf("renturning indexOfNextZeroOrEndOfArray   = %d%n", indexOfNextZeroOrEndOfArray  );
	return indexOfNextZeroOrEndOfArray ;
	}

	
}
