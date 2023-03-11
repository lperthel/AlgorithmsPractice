package com.lperthel.datastructures;

public class BullsAndCows {
	public String getHint ( String secret, String guess) {
		int matches=0, close= 0;
		int[] freq = new int [26];
		for ( int i= 0; i< secret.length(); i++) 
		freq [ secret.charAt (i)-'0'] +=1;
		for ( int i= 0; i < guess.length(); i++){
		char c= guess.charAt(i);
		if ( guess.charAt(i) == secret.charAt(i)) {
		if (freq [ c-'0'] == 0) {
		close --;matches++;
		} else
		{
		matches ++; 
		freq [c -'0'] -= 1;
		}
		}else if (freq [c -'0'] > 0) {
		freq [c -'0'] -= 1;
		close++;
		}
		}
		return matches+"A"+close +"B";
}
		}
