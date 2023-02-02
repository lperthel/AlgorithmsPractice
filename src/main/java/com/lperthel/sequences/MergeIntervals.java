package com.lperthel.sequences;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class MergeIntervals {
 	List<int[]> merged = new LinkedList<>();   
	public int[][] merge(int[][] intervals) {
 		   
 		   //do app
 		   if(intervals.length == 1)
 			   return intervals;
Arrays.sort(intervals, Comparator.comparingInt( e -> e[0]));
//P.t("intervals =", Arrays.deepToString(intervals));
 		   	  helper(intervals);
 		   	  return merged .toArray(new int[merged.size()][]);
    }
	void helper(int[][]  intervals) {
		int min=  intervals[0][0];
 		   int max =  intervals[0][1];
 		  for(int i=1;i <  intervals.length;i++) {
 			  //P.t("i= ", i);
 			 //P.t("min= ", min);
 			  //P.t("max= ", max);
 				//P.t("intervals[i=] ", intervals[i]);
 			                                            if(max <  intervals[i][0]) {                    
 			                                            	updateBounds(min, max);
 			                                            	min =intervals[i][0];
 			                                            	max= intervals[i][1];
 			                                            	//P.t("new min= ", min);
 			                                            	//P.t("new max= ", max);
 			                                            	
 			                                            }
 			                                            else if(max < intervals[i][1]){
 			                                            	max= intervals[i][1];
 			                                            	//P.t("new max= ", max);
 			                                            }
 			                                           if(i+1 == intervals.length)
 			                                        		updateBounds(min,max);
 		  }
	}
	private void updateBounds(int min, int max) {
		//P.t("updating bounds");
		int[] newBound = {min,max};
		//P.t("newBound= ", Arrays.toString(newBound));
		merged.add(newBound);
		//P.t("merged = ",Arrays.deepToString(merged.toArray()));
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