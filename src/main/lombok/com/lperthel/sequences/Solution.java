package com.lperthel.sequences;

import java.util.Arrays;
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
 	   /**
 	 * @param intervals
 	 * @return
 	 */
 	public int[][] merge(int[][] intervals) {
 		   Set<Integer[]> merged= new LinkedHashSet<>();
 		   
 		   //do app
 		   P.t("intervals =", Arrays.deepToString(intervals));
 		   Pair[] intervalPairs =  new Pair[intervals.length];
 		   for(int i=0;i<intervals.length;i++) {
 			   intervalPairs[i] = new Pair(intervals[i][0],intervals[i][1]);
 		   }
 		   P.t(Arrays.toString(intervalPairs));;
Arrays.sort(intervalPairs); 		   
 		  helper(intervalPairs, merged);
 		  return formatAnswer(merged);
    }
	private void helper(Pair[]  intervals, Set<Integer[]> merged) {
		int min=  intervals[0].getMin();
 		   int max =  intervals[0].getMax();
 		  for(int i=1;i <=  intervals.length;i++) {
 			  P.t("i= ", i);
 			 P.t("min= ", min);
 			  P.t("max= ", max);
 			  if(i< intervals.length) {
 				P.t("intervals[i=] ", intervals[i]);
 			  }
 			                                            if(i ==  intervals.length ||   max <  intervals[i].getMin()) {                    
 			                                            	P.t("updating bounds");
 			                                            	Integer[] newBound = {min,max};
 			                                            	P.t("newBound= ", Arrays.deepToString(newBound));
 			                                            	merged.add(newBound);
 			                                            	P.t("merged = ",Arrays.deepToString(merged.toArray()));
 			                                            	if(i !=  intervals.length) {	
 			                                            	min =intervals[i].getMin();
 			                                            	max= intervals[i].getMax();
 			                                            	P.t("new min= ", min);
 			                                            	P.t("new max= ", max);
 			                                            	}
 			                                            }
 			                                            else {
 			                                            	max= intervals[i].getMax();;
 			                                            	P.t("new max= ", max);
 			                                            }
 		  }
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
	@Getter
	@Setter
	@ToString
	@EqualsAndHashCode
	@NoArgsConstructor
	@AllArgsConstructor
	protected class Pair implements Comparable<Pair>{
		private Integer min;
		private Integer max;
		@Override
		public int compareTo(Pair o) {
			return min - o.min;
		}
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