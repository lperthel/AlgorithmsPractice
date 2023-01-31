package com.lperthel.sequences;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
        	Map<String, List<String>> anagramGroups = new HashMap<>();
        	List<List<String>> answer = new LinkedList<>();
        	Arrays.stream(strs).forEach( word ->{
        	int [] anagramKey = new int[26];
        	word.chars().forEach(letter ->
        	anagramKey[letter - 97] = 1
        			);
        	StringBuilder letterCount = new StringBuilder("");
        	for(int i =0;i<anagramKey.length;i++) {
        		letterCount.append(anagramKey[i]);
        	}
        	

        	List<String> group = anagramGroups.get(letterCount.toString());
        	if(group == null) {
        		group = new LinkedList<>();
        		anagramGroups.put(letterCount.toString(),group);
        	}
        	group.add(word);
        });
        	return answer;
        }        
    }
 