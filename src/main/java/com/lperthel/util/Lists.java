package com.lperthel.util;

import java.util.List;

public class Lists <T>{
  public static <T> boolean deepContainsAll(List<List<T>> subjectList, List<List<T>> subList) {
	
		
			for(List<T>l2: subList) {
				boolean foundMatch = false;
				for(List<T> l1:subjectList) {
				if(l1.containsAll(l2))
				foundMatch = true;
		}
			if(!foundMatch)
				return false;
	}
	  return true;
}
}
