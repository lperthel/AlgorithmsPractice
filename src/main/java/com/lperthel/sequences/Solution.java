package com.lperthel.sequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {
        private Map<String, List<String>> anagramGroups;
		public List<List<String>> groupAnagrams(String[] strs) {
        	anagramGroups = new HashMap<>();
        	List<List<String>> answer = new LinkedList<>();
        	
        	//P.t("strs =" , Arrays.toString(strs));;
        	Arrays.stream(strs).forEach( word ->{
        	int [] anagramKey = new int[26];
        	//P.t("word= ", word);
        	word.chars().forEach(letter ->{
        		//P.t("letter= ", letter);
        		final int asciiOffset = 97;
        		anagramKey[letter - asciiOffset ]++;
        		//P.t("anagramKey= ", Arrays.toString(anagramKey));
        	});
        	String letterCount = Arrays.toString(anagramKey);        	
        	//P.t("letterCount= ", letterCount);        	

        	addwordToAnagramGroups(word, letterCount);
        });
        	
        	return new ArrayList<>(anagramGroups.values());
        }
		private void addwordToAnagramGroups(String word, String letterCount) {
			List<String> group = anagramGroups.get(letterCount);
        	if(group == null) {
        		//P.t("No group found for group= ", letterCount, ". Creating Group");
        		group = new LinkedList<>();
        		anagramGroups.put(letterCount,group);
        	}
        	group.add(word);
        	//P.t("Updating anagramGroups. Group now = ", anagramGroups.get(letterCount));
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
