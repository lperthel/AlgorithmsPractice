package com.lperthel.sequences;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
 	   public int[][] merge(int[][] intervals) {
 		   Set<Integer[]> merged= new LinkedHashSet<>();
 		   int [][] answer;
 		   answer = new int[merged.size()][2];
 		   int i =0;
 		   Iterator<Integer[]> mergedIterator = merged.iterator();
 		   while(mergedIterator.hasNext()) {
 			   Integer [] e = mergedIterator.next();
 			  answer[i][0] = e[0];
 			  answer[i][1] = e[1];
 		   }
    	return answer;
    }
}