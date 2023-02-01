package com.lperthel.sequences;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
        	Map<String, List<String>> anagramGroups = new HashMap<>();
        	List<List<String>> answer = new LinkedList<>();
        	
        	P.t("strs =" , Arrays.toString(strs));;
        	Arrays.stream(strs).forEach( word ->{
        	int [] anagramKey = new int[26];
        	P.t("word= ", word);
        	word.chars().forEach(letter ->{
        		P.t("letter= ", letter);
        		final int asciiOffset = 97;
        		anagramKey[letter - asciiOffset ]++;
        		P.t("anagramKey= ", Arrays.toString(anagramKey));
        	});
        	StringBuilder letterCount = new StringBuilder("");
        	for(int i =0;i<anagramKey.length;i++) {
        		letterCount.append(anagramKey[i]);
        	}
        	P.t("letterCount= ", letterCount);        	

        	List<String> group = anagramGroups.get(letterCount.toString());
        	if(group == null) {
        		P.t("No group found for group= ", letterCount, ". Creating Group");
        		group = new LinkedList<>();
        		anagramGroups.put(letterCount.toString(),group);
        	}
        	group.add(word);
        	P.t("Updating anagramGroups. Group now = ", anagramGroups.get(letterCount.toString()));
        });
        	
        	answer = anagramGroups.values().stream().collect(Collectors.toList());		
        	P.t("answer= ", answer);
        	return answer;
        }
        protected static class P{
    		 public static void t(Object... args){
    
    			 for(Object elem:args) {		
    		 		System.out.print(elem+ " ");
    		 	}
    		 	System.out.println();
    		 }
    		 public static void t(Object str, Object[]... args){
    			 System.out.print(str);
    			 for(Object elem:args) {		
    		 		System.out.print(elem+ " ");
    		 	}
    		 	System.out.println();
    		 }

        }
    }
