package com.lperthel.sequences;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxProductSubarrayyTest {

	private Solution  maxProductSubArray  = new Solution ();

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
		final int[] singleZeroElementArray = {0};
		int expectedProduct = 2;
		int actualProduct;
		actualProduct = maxProductSubArray  .maxProduct(singleElementArray );
		assertEquals(expectedProduct,actualProduct);
		expectedProduct = 0;
		actualProduct = maxProductSubArray  .maxProduct(singleZeroElementArray );
		assertEquals(expectedProduct,actualProduct);		

	}

	
	@Test
	public void testGivenArrayWithEvenAmountOfNegativeNumbersExpectProductOfArray() {
		final int[] arrayWithEvenNumberOfNegativeNymbers = {-2, -3, -2, -4};
		final 		int expectedProduct = 48;
final int 		actualProduct = maxProductSubArray  .maxProduct(arrayWithEvenNumberOfNegativeNymbers  );
		assertEquals(expectedProduct,actualProduct);		
	}
	@Test
	public void testGivenArrayWithNoNegativeNumbersReturnProdctOfArray() {

		final int[] arrayWithNoNegativeNumbers= {4,2, 3, 2};
		final 		int expectedProduct = 48;
		
final int 		actualProduct = maxProductSubArray  .maxProduct(arrayWithNoNegativeNumbers);
		assertEquals(expectedProduct,actualProduct);		
	}
	@Test
	public void testGivenArrayWithPrefixAsLargestProductExpectProdctOfPrefix() {
		final int[] arrayWithLargestPrefixProduct = {2, 3, -2, 4};
final 		int expectedProduct = 6;
final int 		actualProduct = maxProductSubArray  .maxProduct(arrayWithLargestPrefixProduct);
		assertEquals(expectedProduct,actualProduct);		
	}
	
	@Test
	public void testGivenArrayWithSuffixAsLargestProductExpectSuffixProduct(){
		final int[] arrayWithSuffixAsLargestProduct= {4,-2, 3, 2};
		final 		int expectedProduct = 6;
	
		final int 		actualProduct = maxProductSubArray  .maxProduct(arrayWithSuffixAsLargestProduct);
		assertEquals(expectedProduct,actualProduct);		

	}
	@Test
	public void testGivenArrayWithSingleZeroGroupAndLargestPrefixProductExpectPrefixProduct() {
		final int[] arrayWithSingleZero = {2 ,3,  0, -1};
		final int[] arrayWithDoubleZero = {2, 4, 0, 0, -1,2};
		final int[] arrayWithTripleZero = {2 ,5, 0, 0,0, -1,2	};
		final 		int expectedSingleZeroProduct = 6;
		final 		int expectedDoubleZeroProduct = 8;
		final 		int expectedTripleZeroProduct = 10;
		int 		actualProduct = maxProductSubArray  .maxProduct(arrayWithSingleZero );
		assertEquals(expectedSingleZeroProduct ,actualProduct);
				actualProduct = maxProductSubArray  .maxProduct(arrayWithDoubleZero );
		assertEquals(expectedDoubleZeroProduct , actualProduct);		
		actualProduct = maxProductSubArray  .maxProduct(arrayWithTripleZero );
		assertEquals(expectedTripleZeroProduct ,actualProduct);		
}
@Test
		public void testArrayWithZeroAsLargestElement() {
			final int[] arrayWithZeroAsLargestNumber= {0,-2,0};
			final 		int expectedProduct = 0;		
			final int 		actualProduct = maxProductSubArray  .maxProduct(arrayWithZeroAsLargestNumber);
			assertEquals(expectedProduct,actualProduct);
			}
	
	
		@Test
		public void testGivenArrayWithSingleZeroGroupAndLargestSuffixProductExpectSuffixProduct() {		
			final int[] arrayWithSingleZeroAndLargestSuffix = {2, -1, 0, 2, 3};
			final int[] arrayWithDoubleZerosAndLargestSuffix = {2, -1, 0, 0, 2, 4};
			final int[] arrayWithTripleZerosAndLargestSuffix = {2,-1, 0, 0, 0, 2, 5};
			final 		int expectedSingleZeroProduct = 6;
			final 		int expectedDoubleZeroProduct = 8;
			final 		int expectedTripleZeroProduct = 10;
			int actualProduct;
actualProduct = maxProductSubArray  .maxProduct(arrayWithSingleZeroAndLargestSuffix );
assertEquals(expectedSingleZeroProduct ,actualProduct);			
			actualProduct = maxProductSubArray  .maxProduct(arrayWithDoubleZerosAndLargestSuffix );
						assertEquals(expectedDoubleZeroProduct ,actualProduct);
						actualProduct = maxProductSubArray  .maxProduct(arrayWithTripleZerosAndLargestSuffix );
						assertEquals(expectedTripleZeroProduct ,actualProduct);
	}
		@Test
		public void testGivenArrayWithMultiZeroGroupAndLargestPrefixProductExpectPrefixProduct() {
		final int[] arrayWithMultiZeroGroupsAndLargestPrefixProduct = {5, 4, 0, 2, -6, 0, 2, 4};
			final 		int expectedProduct = 20;
			int 		actualProduct = maxProductSubArray  .maxProduct(arrayWithMultiZeroGroupsAndLargestPrefixProduct );
			assertEquals(expectedProduct ,actualProduct);
		}
		@Test
		public void testGivenArrayWithMultiZeroGroupAndLargestMiddleProductExpectMiddleProduct() {
		final int[] arrayWithMultiZeroGroupsAndLargestMiddleProduct = {2,-6,0,4,5,0, 2,4};
			final 		int expectedProduct = 20;
			int 		actualProduct = maxProductSubArray  .maxProduct(arrayWithMultiZeroGroupsAndLargestMiddleProduct );
			assertEquals(expectedProduct ,actualProduct);
		}
		@Test
		public void testGivenArrayWithMultiZeroGroupAndLargestSuffixProductExpectSuffixProduct() {
		final int[] arrayWithMultiZeroGroupsAndLargestSuffixProduct = {2,4, 0, 2, -6, 0, 5,4};
			final 		int expectedProduct = 20;
			int 		actualProduct = maxProductSubArray  .maxProduct(arrayWithMultiZeroGroupsAndLargestSuffixProduct );
			assertEquals(expectedProduct ,actualProduct);
		}
}	