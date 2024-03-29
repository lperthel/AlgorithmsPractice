package com.lperthel.dynamicProgramming;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
    	int minPrice = prices[0], maxProfit = 0;
    	for(int i = 0; i<prices.length;i++) {
    		minPrice = Math.min(minPrice, prices[i]);
    		maxProfit = Math.max(maxProfit, prices[i]-minPrice);
    	}
    	return maxProfit;
    }
}
