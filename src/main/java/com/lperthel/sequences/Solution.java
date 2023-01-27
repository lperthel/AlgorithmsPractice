package com.lperthel.sequences;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
 	   /**
 	 * @param intervals
 	 * @return
 	 */
 	public int[][] merge(int[][] intervals) {
 		   Set<Integer[]> merged= new LinkedHashSet<>();
 		   
 		   int [][] answer;
 		   //do app
 		   P.t("intervals =", Arrays.deepToString(intervals));
 		   if(intervals.length == 0)
 			   return intervals;
 		  int max= intervals[0][1];
 		   int min= intervals[0][0];
 		  for(int i=0;i<intervals.length;i++) {
 			 int[] e = intervals[i];
 			P.t("i= ", i);
 			 P.t("min= ", min);
 			  P.t("max= ", max);
 			  P.t("intervals[i=] ", e);
 			                                            if(i+1 == intervals.length || max  < e[i+1]) {                    
 			                                            	Integer[] newBound = {min,max};
 			                                            	P.t("newBound= ", Arrays.deepToString(newBound));
 			                                            	merged.add(newBound);
 			                                            	if(i+1 != intervals.length)
 			                                            	{
 			                                            		min = intervals[i+1][0];
 			                                            	max= intervals[i+1][1];
 			                                            	P.t("new min= ", min);
 			                                            	P.t("new max= ", max);
 			                                            	}
 			                                            }
 			                                            else {
 			                                            	P.t("new max= ", max);
 			                                            	max= intervals[i+1][1];
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
 		  P.t("answer=", Arrays.deepToString(answer));
 		   return answer;
    }
 	  protected static class P{
 		 public static void t(Object... args){
 		 	for(Object elem:args) {		
 		 		System.out.print(elem+ " ");
 		 	}
 		 	System.out.println();
 		 }
 		 }

}