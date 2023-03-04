package com.lperthel.dynamicProgramming;

import java.util.Arrays;

public class Solution {
	public int uniquePaths(int m, int n) {
	int[] previousCost = new int[n];
	int[] cost = new int[n];
	Arrays.fill(previousCost, 1);
	if(m == 1 || n == 1)
		return 1;
	for(int i =1;i<m;i++) {
	for(int j = 0;j<n;j++) {
		if(j==0)
			cost[j] = 1;
		else
			cost[j] = previousCost[j]+ cost[j-1];
	}
	System.arraycopy(cost, 0, previousCost, 0, n);
	
	}
	return cost[n-1];
	}
}
