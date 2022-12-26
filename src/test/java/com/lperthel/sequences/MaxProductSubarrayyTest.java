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
		actualProduct = maxProductSubArray  .findMaxProductWithinArray(singleElementArray );
		assertEquals(expectedProduct,actualProduct);		
	}

	/*
	@Test
	public void testGivenArrayWithEvenAmountOfNegativeNumbersExpectProductOfArray() {
		final int[] arrayWithEvenNumberOfNegativeNymbers = {-2, -3, -2, -4};
		final 		int expectedProduct = 48;
final int 		actualProduct = maxProductSubArray  .findMaxProductWithinArrayBounds(0,arrayWithEvenNumberOfNegativeNymbers.length,arrayWithEvenNumberOfNegativeNymbers  );
		assertEquals(expectedProduct,actualProduct);		
	}
	@Test
	public void testGivenArrayWithNoNegativeNumbersReturnProdctOfArray() {

		final int[] arrayWithNoNegativeNumbers= {4,2, 3, 2};
		final 		int expectedProduct = 48;
		
final int 		actualProduct = maxProductSubArray  .findMaxProductWithinArrayBounds(0,arrayWithNoNegativeNumbers.length,arrayWithNoNegativeNumbers);
		assertEquals(expectedProduct,actualProduct);		


	}
	@Test
	public void testGivenArrayWithPrefixAsLargestProductExpectProdctOfPrefix() {
		final int[] arrayWithLargestPrefixProduct = {2, 3, -2, 4};
final 		int expectedProduct = 6;
final int 		actualProduct = maxProductSubArray  .findMaxProductWithinArrayBounds(0,arrayWithLargestPrefixProduct.length,arrayWithLargestPrefixProduct);
		assertEquals(expectedProduct,actualProduct);		
	}
	
	@Test
	public void testGivenArrayWithSuffixAsLargestProductExpectSuffixProduct(){
		final int[] arrayWithSuffixAsLargestProduct= {4,-2, 3, 2};
		final 		int expectedProduct = 6;
	
		final int 		actualProduct = maxProductSubArray  .findMaxProductWithinArrayBounds(0,arrayWithSuffixAsLargestProduct.length,arrayWithSuffixAsLargestProduct);
		assertEquals(expectedProduct,actualProduct);		

	}
	@Test
	public void testGivenArrayWithSingleZeroAndLargestPrefixProductExpectPrefixProduct() {
		final int[] arrayWithSingleZero = {2 ,3,  0, -1};
		final 		int expectedProduct = 6;
		
		final int 		actualProduct = maxProductSubArray  .findMaxProductWithinArrayBounds(0,arrayWithSingleZero .length,arrayWithSingleZero );
		assertEquals(expectedProduct,actualProduct);		

}
		@Test
		public void testGivenArrayWithSingleZeroAndLargestSuffixProductExpectSuffixProduct() {		
			final int[] arrayWithSingleZeroAndLargestSuffix = {-1, 0, 2, 3};
			final 		int expectedProduct = 6;
			
			final int 		actualProduct = maxProductSubArray  .findMaxProductWithinArrayBounds(0,arrayWithSingleZeroAndLargestSuffix .length,arrayWithSingleZeroAndLargestSuffix );
			assertEquals(expectedProduct,actualProduct);		
	}
@Test
		public void testArrayWithZeroAsLargestElement() {
			final int[] arrayWithZeroAsLargestNumber= {-2, 0, -1};
			final 		int expectedProduct = 0;		
			final int 		actualProduct = maxProductSubArray  .findMaxProductWithinArrayBounds(0,arrayWithZeroAsLargestNumber.length,arrayWithZeroAsLargestNumber);
			assertEquals(expectedProduct,actualProduct);		

	}
	*/				

}	