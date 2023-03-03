package com.lperthel.dynamicProgramming;

class FibNumber {
    public int fib(int n) {
    	int f0 = 0;
    	int f1 = 1, fx = -1;
        if(n == 0)
        	return f0;
        else if(n == 1)
        	return f1;
        for(int i= 2;i<=n;i++) {
        	fx = f0+f1;
        	f0=f1;
        	f1=fx;
        }
        return fx;
        	
    }
}