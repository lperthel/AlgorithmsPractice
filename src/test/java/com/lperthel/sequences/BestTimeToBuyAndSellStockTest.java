package com.lperthel.sequences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {
private BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
	@Test
	void testGivenLowDayTwoHighDayFive_ExpectPriceDifferences() {
		int[] input = {7,1,5,3,6,4} ;
		int expected = 5;
		int actual = solution.maxProfit(input);
	assertEquals(expected,actual);
	}
	@Test
	void testGivenFallingMarketExpectZeroProfit() {
		int[] input = {7,6,4,3,1} ;
		int expected = 0;
		int actual = solution.maxProfit(input);
	assertEquals(expected,actual);
	}

}
