package com.lperthel.sequences;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

class Solution {
	private Set<Integer[]> merged= new LinkedHashSet<>();
 	   public int[][] merge(int[][] intervals) {
 		   
 		   
 		   //do app
 		   P.t("intervals =", Arrays.deepToString(intervals));
Arrays.sort(intervals, Comparator.comparingInt( e -> e[0]));
P.t("intervals =", Arrays.deepToString(intervals));
 		   	  helper(intervals);
 		  return formatAnswer();
    }
	private void helper(int[][]  intervals) {
		int min=  intervals[0][0];
 		   int max =  intervals[0][1];
 		  for(int i=1;i <  intervals.length;i++) {
 			  P.t("i= ", i);
 			 P.t("min= ", min);
 			  P.t("max= ", max);
 				P.t("intervals[i=] ", intervals[i]);
 			                                            if(i ==  intervals.length ||   max <  intervals[i][0]) {                    
 			                                            	updateBounds(min, max);
 			                                            	min =intervals[i][0];
 			                                            	max= intervals[i][1];
 			                                            	P.t("new min= ", min);
 			                                            	P.t("new max= ", max);
 			                                            	
 			                                            }
 			                                            else if(max < intervals[i][1]){
 			                                            	max= intervals[i][1];
 			                                            	P.t("new max= ", max);
 			                                            }
 			                                           if(i+1 == intervals.length)
 			                                        		updateBounds(min,max);

 		  }
 		  
	}
	private void updateBounds(int min, int max) {
		P.t("updating bounds");
		Integer[] newBound = {min,max};
		P.t("newBound= ", Arrays.deepToString(newBound));
		merged.add(newBound);
		P.t("merged = ",Arrays.deepToString(merged.toArray()));
	}
	private int[][] formatAnswer() {
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