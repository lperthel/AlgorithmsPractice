package com.lperthel.sequences;

import java.util.Stack;

class Solution{
	public boolean backspaceCompare(String s ,String t) {
		Stack< Character> a = makeStack( s);
		Stack< Character> b= makeStack(t);
		if ( a . size ( ) != b. size ( ))
				return false;
		while (!a.isEmpty ())
				if (! a.pop (). equals (b.pop ()))
						return false;
				return true;
	}
				Stack< Character> makeStack ( String s) {
				Stack <Character> stack = new Stack<> ();
				for ( int i= 0; i < s. length(); i++) {
				if ( s.charAt( i) =='#') {
					if(!stack.isEmpty())
						stack.pop ();
					else continue;
				} else 
				
				stack. push (s.charAt (i));
				}
				return stack ;

	}
}