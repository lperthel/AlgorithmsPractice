package com.lperthel.dynamicProgramming;
class Solution {
	public int minCostClimbingStairs(int[] cost) {
 int fx=-1, f0=cost[0],f1=cost[1];
 for(int i = 2;i<=cost.length;i++) {
	 if(i<cost.length){
	 fx = Math.min(f0, f1)+cost[i];
	 f0=f1;
	f1=fx;
	 } else
		 fx = Math.min(f0, f1);
	 
 }
     	return fx     ;
    }
}