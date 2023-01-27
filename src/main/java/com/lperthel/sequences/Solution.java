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
 		  int max= intervals[0][1];
 		   int min= intervals[0][0];
 		  for(int i=1;i <= intervals.length;i++) {
 			 int[] e = null;
 			  P.t("i= ", i);
 			 P.t("min= ", min);
 			  P.t("max= ", max);
 			  if(i<intervals.length) {
 				 e = intervals[i];
 				P.t("intervals[i=] ", Arrays.toString(e));
 			  }
 			                                            if(i == intervals.length ||   max < intervals[i][0]) {                    
 			                                            	P.t("updating bounds");
 			                                            	Integer[] newBound = {min,max};
 			                                            	P.t("newBound= ", Arrays.deepToString(newBound));
 			                                            	merged.add(newBound);
 			                                            	P.t("merged = ",Arrays.deepToString(merged.toArray()));
 			                                            	if(i != intervals.length) {	
 			                                            	min = e[0];
 			                                            	max= e[1];
 			                                            	P.t("new min= ", min);
 			                                            	P.t("new max= ", max);
 			                                            	}
 			                                            }
 			                                            else {
 			                                            	max= e[1];
 			                                            	P.t("new max= ", max);
 			                                            }
 		  }
 		  
//format answer
 		  return formatAnswer(merged);
    }
	private int[][] formatAnswer(Set<Integer[]> merged) {
		int[][] answer;
		answer = new int[merged.size()][2];
 		   int i =0;
 		   Iterator<Integer[]> mergedIterator = merged.iterator();
 		   while(mergedIterator.hasNext()) {
 			   Integer [] e = mergedIterator.next();
 			  answer[i][0] = e[0];
 			  answer[i][1] = e[1];
 			 P.t("e= ", Arrays.deepToString(e));
 			 P.t("answer= ", Arrays.deepToString(answer));
 			i++;
 		   }
 		  
 		  
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