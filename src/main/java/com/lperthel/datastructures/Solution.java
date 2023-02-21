package com.lperthel.datastructures;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
    	int left=0, right= 0, longest= 0;
    	Set<Character> uniqueChars = new HashSet<>();
    	while(right<s.length()) {
    		if(!uniqueChars.contains(s.charAt(right))) {
    			uniqueChars.add(s.charAt(right));
    			longest = (right - left+1) > longest ? (right - left +1) : longest;
    			right++;
    		} else {
    			while(uniqueChars.contains(s.charAt(right))) {
    				uniqueChars.remove(s.charAt(left));
    				left++;
    			}
    		}
    	}
    	return longest;
    }
}