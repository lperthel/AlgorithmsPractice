package com.lperthel.trees;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class NaryTreePreorderTraversal {
 public List<Integer> preorder(Node root) {
	 List<Integer> output= new LinkedList<>();
	 Stack<Node> stack= new Stack<>();
	 if(root == null)
		 return output;
	 stack.push(root);
	 while(!stack.isEmpty()) {
		 Node node = stack.pop();
		 output.add(node.val);
		 if(node.children !=null) {
		 Collections.reverse(node.children);
		 for(Node c : node.children)
			 stack.push(c);
	 }
	 }
	 return output;
 }	 
}