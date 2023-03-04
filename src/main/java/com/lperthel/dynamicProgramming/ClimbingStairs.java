package com.lperthel.dynamicProgramming;
class ClimbingStairs {
    public int climbStairs(int n) {
 int fx=-1, f1=1,f2=2;
    	if(n ==1)
	 return f1;
 else  if(n == 2)
	 return f2;
 for(int i = 3;i<=n;i++) {
	 fx = f1+f2;
	 f1=f2;
	 f2=fx;
 }
     	return fx     ;
    }
}