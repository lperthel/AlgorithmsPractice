package com.lperthel.slidingwindow;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class FindAllAnagramsInAString {
	Map<Character,Integer> current ;
    public List<Integer> findAnagrams(String s, String p) {
    	List<Integer> anagrams = new LinkedList<>();
    	current = new HashMap<>    ();
    	Map<Character,Integer> key = new HashMap<>    ();
    	char leftChar, rightChar;
    	int left = 0, right = 0;
    	initKey(p, key);
    	initLetterCounter(current);
    	for(right = 0;right<s.length();right++) {
    		rightChar = s.charAt(right);
    		leftChar = s.charAt(left);
    		if(!current.containsKey(rightChar))
    		current.put(rightChar,1);
    	else 
    		current.put(rightChar,current.get(rightChar)+1);
    		if(key.equals(current)) 
        		anagrams.add(left);
        		if(right - left == p.length()-1) {
        			current.put(leftChar,current.get(leftChar)-1);
            		left++;
        		}
    	}
return anagrams;
}

	private void initKey(String p, Map<Character, Integer> key) {
		char rightChar;
		initLetterCounter(key);
		for(int i = 0;i<p.length();i++) {
    		rightChar = p.charAt(i);
    		key.put(rightChar, key.get(rightChar)+1);
    	}
	}

	private void initLetterCounter(Map<Character, Integer> letterCounter) {
		for(int i = 'a';i<='z';i++) {
			letterCounter.put((char)i, 0);
		}
	}

		}