package com.lperthel.datastructures;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
    	if(s == null || s.length() == 0)
    		return 0;
    	int longest= 0;
    	Map<Character,Integer> map = new HashMap<>();
    	for(int i=0, j=0; j<s.length();j++) {
    		if(map.containsKey(s.charAt(j))) {
    			i =  Math.max(i, map.get(s.charAt(j)));
    		}
    		longest= Math.max(longest, j-i+1);
    		map.put(s.charAt(j), j+1);
    	}
    	   	return longest;
    }
}