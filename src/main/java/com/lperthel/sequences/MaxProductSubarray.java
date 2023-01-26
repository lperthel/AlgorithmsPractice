package com.lperthel.sequences;


public final class MaxProductSubarray {

	public int maxProduct(int[] nums) {

		int startIndex = 0;
		int endIndex; 
		int maxProduct = Integer.MIN_VALUE;
		int subArrayProduct;
		boolean arrayHasZeroAsAnElement = false;
		if(nums.length ==1) {
			return nums[0];
		}
		startIndex = findNextNonZeroIndex(startIndex ,nums);
		if(startIndex !=0) {
			arrayHasZeroAsAnElement = true;
		}
		while(startIndex < nums.length){
			endIndex =getIndexOfNextZeroOrEndOfArray(startIndex, nums);
			if(endIndex < nums.length) {
				arrayHasZeroAsAnElement = true;
			}
			subArrayProduct = findMaxProductWithinArrayBounds(startIndex, endIndex, nums);
			if(maxProduct < subArrayProduct) {
				maxProduct =subArrayProduct; 
			}
			startIndex = endIndex +1;
//			startIndex = findNextNonZeroIndex(endIndex +1,nums);
		}

		if(arrayHasZeroAsAnElement && maxProduct < 0) {

			maxProduct = 0;
		}

		return maxProduct;
	}

	public int findNextNonZeroIndex(int startIndex, int[] nums){

		for(;startIndex< nums.length;startIndex++) {
			if(nums[startIndex] != 0){
				break;
			}
		}
		return startIndex;
	}
	public int findMaxProductWithinArrayBounds(int startIndex, int endIndex, int[] nums) {
		if(endIndex - startIndex ==1) {
			return nums[startIndex];
		}
		int prefixProduct = 1;
		int suffixProduct = 1;
		int maxProduct;
		int currentElement;
		for(int i = startIndex; i<endIndex;i++) {
			currentElement = nums[i];
			suffixProduct *= nums[i];
		}
		maxProduct = suffixProduct;
		for(int i = startIndex; i<endIndex;i++) {
			currentElement = nums[i];
			if(currentElement > maxProduct) {
				maxProduct = currentElement;
			}
			suffixProduct /= currentElement;
			if( suffixProduct> maxProduct  && i+1 !=endIndex) {
				maxProduct = suffixProduct;
			}
			if(prefixProduct > maxProduct && i !=startIndex) {
				maxProduct = prefixProduct ;
			}				
			prefixProduct *= currentElement;

		}

		return maxProduct;
	}

	public int getIndexOfNextZeroOrEndOfArray(int startIndex, int[] nums) {

		int indexOfNextZeroOrEndOfArray  = -1;
		int i = startIndex;
		while(indexOfNextZeroOrEndOfArray == -1) {
			if(nums[i] ==0) {
				indexOfNextZeroOrEndOfArray  = i;
			}
			else if(i+1 == nums.length) {
				indexOfNextZeroOrEndOfArray = nums.length; 
			}
			i++;
		}
		return indexOfNextZeroOrEndOfArray ;
	}


}
