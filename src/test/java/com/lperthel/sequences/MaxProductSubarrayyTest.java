package com.lperthel.sequences;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxProductSubarrayyTest {

	private MaxProductSubArray  maxProductSubArray  = new MaxProductSubArray ();

	@Test
	public void testgetIndexOfNextZeroOrEndOfArray(){ 
		System.out.println("runninng testgetIndexOfNextZeroOrEndOfArray");
		final int [] multiZeroArray = {0, 1, 1, 0, 1, 1, 0, 1};
		int actualIndex;
		int expectedIndex = 0;
		int startIndex = 0;
		actualIndex = maxProductSubArray  .getIndexOfNextZeroOrEndOfArray(startIndex, multiZeroArray);

		assertEquals(expectedIndex,actualIndex);	
		startIndex = expectedIndex+1;
		expectedIndex = 3;
		actualIndex = maxProductSubArray  .getIndexOfNextZeroOrEndOfArray(startIndex, multiZeroArray);
		assertEquals(expectedIndex,actualIndex);
		startIndex = expectedIndex+1;
		expectedIndex = 6;
		actualIndex = maxProductSubArray  .getIndexOfNextZeroOrEndOfArray(startIndex, multiZeroArray);
		assertEquals(expectedIndex,actualIndex);
		startIndex = expectedIndex+1;
		expectedIndex = 8;
		actualIndex = maxProductSubArray  .getIndexOfNextZeroOrEndOfArray(startIndex, multiZeroArray);

		assertEquals(expectedIndex,actualIndex);
	}
	
	@Test
	public void testGivenSingleElementArrayExpectSingleElement() {
		final int[] singleElementArray = {2};
		final 		int expectedProduct = 2;
		int actualProduct;
		actualProduct = maxProductSubArray  .findMaxProductWithinArrayBounds(0,singleElementArray.length ,singleElementArray );
		assertEquals(expectedProduct,actualProduct);		
	}
}	

		/*
	@Test
	public void testGivenSingleElementArrayExpectSingleElement() {
		final int[] singleElementArray = {2};
		final 		int expectedProduct = 2;
		int actualProduct;
		actualProduct = maxProductSubarray .findLargestProductInArray(singleElementArray );
		assertEquals(expectedProduct,actualProduct);		

	}


	@Test
	public void testGivenArrayWithEvenAmountOfNegativeNumbersExpectProductOfArray() {
		final int[] arrayWithEvenNumberOfNegativeNymbers = {-2, -3, -2, -4};
		final 		int expectedProduct = 48;
		int actualProduct;
		actualProduct = maxProductSubarray .findLargestProductInArray(arrayWithEvenNumberOfNegativeNymbers );
		assertEquals(expectedProduct,actualProduct);		


	}

	@Test
	public void testGivenArrayWithNoNegativeNumbersReturnProdctOfArray() {

		final int[] arrayWithNoNegativeNumbers= {4,2, 3, 2};
		final 		int expectedProduct = 48;
		int actualProduct;
		actualProduct = maxProductSubarray .findLargestProductInArray(arrayWithNoNegativeNumbers);
		assertEquals(expectedProduct,actualProduct);		


	}

		@Test
		public void testGivenArrayWithPrefixAsLargestProductExpectProdctOfPrefix() {
			final int[] arrayWithLargestPrefixProduct = {2, 3, -2, 4};
	final 		int expectedProduct = 6;
			int actualProduct;


			actualProduct = maxProductSubarray .findLargestProductInArray(arrayWithLargestPrefixProduct);
			assertEquals(expectedProduct,actualProduct);		
		}

		@Test
		public void testGivenArrayWithSuffixAsLargestProductExpectSuffixProduct(){
			final int[] arrayWithSuffixAsLargestProduct= {4,-2, 3, 2};
			final 		int expectedProduct = 6;
			int actualProduct;
			actualProduct = maxProductSubarray .findLargestProductInArray(arrayWithSuffixAsLargestProduct);
			assertEquals(expectedProduct,actualProduct);		

		}

		@Test
		public void testGivenArrayWithSingleZeroAndLargestPrefixProductExpectPrefixProduct() {
			final int[] arrayWithSingleZero = {2 ,3,  0, -1};
			final 		int expectedProduct = 6;
			int actualProduct;
			actualProduct = maxProductSubarray .findLargestProductInArray(arrayWithSingleZero );
			assertEquals(expectedProduct,actualProduct);		

	}

		@Test
		public void testGivenArrayWithSingleZeroAndLargestSuffixProductExpectSuffixProduct() {		
			final int[] arrayWithSingleZeroAndLargestSuffix = {-1, 0, 2, 3};
			final 		int expectedProduct = 6;
			int actualProduct;
			actualProduct = maxProductSubarray .findLargestProductInArray(arrayWithSingleZeroAndLargestSuffix );
			assertEquals(expectedProduct,actualProduct);		

	}

		@Test
		public void testArrayWithZeroAsLargestElement() {
			final int[] arrayWithZeroAsLargestNumber= {-2, 0, -1};
			final 		int expectedProduct = 0;
			int actualProduct;
			actualProduct = maxProductSubarray .findLargestProductInArray(arrayWithZeroAsLargestNumber);
			assertEquals(expectedProduct,actualProduct);		


	}				
 */