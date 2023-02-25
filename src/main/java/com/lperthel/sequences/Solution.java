package com.lperthel.sequences;


import java.util.HashMap;
import java.util.Map;

public class Solution {

	public int longestPalindrome(String s) {
		Map<Character,Integer> map = new HashMap<>();
		int occurance, maxLength = 0;
		for(int i = 0;i<s.length();i++) {

			if(map.containsKey(s.charAt(i)))
				occurance = map.get(s.charAt(i))+1;
			else occurance = 1;
			map.put(s.charAt(i), occurance);
		}
		boolean hasOddValues = false;
		for(int val:map.values()) {
			if(val%2 == 0)
				maxLength +=val;
			else {
				hasOddValues = true;
				maxLength +=val -1;
			}
		}
		if(hasOddValues)
			maxLength++;
		return maxLength ;
	}
}