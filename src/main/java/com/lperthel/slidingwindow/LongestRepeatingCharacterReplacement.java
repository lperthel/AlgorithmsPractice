package com.lperthel.slidingwindow;

public class LongestRepeatingCharacterReplacement {
	public int characterReplacement(String s, int k) {
		int validWindowSize=1,invalidWindowSize=
		s.length()+1,testWindowSize;
		while(validWindowSize+1<invalidWindowSize){
		testWindowSize=validWindowSize+
		(invalidWindowSize-validWindowSize)/2;
		if(canMakeValidSubstring(s,testWindowSize,k))
		validWindowSize=testWindowSize;
		else
		invalidWindowSize=testWindowSize;
		}
		return validWindowSize;
		
}



	
	boolean canMakeValidSubstring(String s, int
			windowSize, int k){
			int[] freq=new int[26];
			int maxFreq= 0, start = 0, end;
			for (end = 0; end <s.length(); end++) {
			char endChar = s.charAt(end);
			freq[endChar-'A'] +=1;
			if (end-start == windowSize) {
			freq[s.charAt(start) -'A'] -= 1;
			start ++;
			}
			maxFreq= Math.max (maxFreq, freq[endChar-'A']);
			if ( maxFreq + k >= windowSize )
			return true;
			}
			return false;
	}
}
