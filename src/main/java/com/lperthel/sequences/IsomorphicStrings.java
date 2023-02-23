package com.lperthel.sequences;

import java.util.HashMap;
import java.util.Map;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
    	Map<Character,Character> sToT = new HashMap<>();
    	Map<Character,Character> tToS= new HashMap<>();
        for(int i = 0;i<s.length();i++) {
        	if(sToT.containsKey(s.charAt(i)) && sToT.get(s.charAt(i)) != t.charAt(i))
        		return false;
        	else sToT.put(s.charAt(i),t.charAt(i));
        	if(tToS.containsKey(t.charAt(i)) && tToS.get(t.charAt(i)) != s.charAt(i))
        		return false;
        	else tToS.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}