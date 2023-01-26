package com.lperthel.sequences;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
 	   public int[][] merge(int[][] intervals) {
 		   Set<Integer[]> merged= new LinkedHashSet<>();
 		   
 		   int [][] answer;
 		   //do app
 		   if(intervals.length == 0)
 			   return intervals;
 		  int max= intervals[0][1];
 		   int min= intervals[0][0];
 		  for(int i=0;i<intervals.length;i++) {
 			  int[] e = intervals[i];
 			                                            if(i+1 == intervals.length || max  < e[i+1]) {                    
 			                                            	Integer[] newBound = {min,max};
 			                                            	merged.add(newBound);
 			                                            	if(i+1 != intervals.length)
 			                                            	{ 			                                            	min = intervals[i+1][0];
 			                                            	max= intervals[i+1][1];
 			                                            	}
 			                                            }
 		  }
//format answer
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