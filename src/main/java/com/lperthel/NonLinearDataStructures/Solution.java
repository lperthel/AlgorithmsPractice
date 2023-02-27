package com.lperthel.NonLinearDataStructures;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root == null)
			return new LinkedList<>();
		else return levelOrderHelper(root);
	}
	
private List<List<Integer>> levelOrderHelper(TreeNode root) {
	
	if(root == null)
		return null;
	List<List<Integer>> leftTail = levelOrder(root.left);
	List<List<Integer>> rightTail = levelOrder(root.right);
	List<List<Integer>>  output = combine(leftTail,rightTail);
	List<Integer> current = new LinkedList<>();
	current.add(root.val);
	if(output == null)
		output = new LinkedList<>();
	output.add(0,current);
	return output;
		
}
private List<List<Integer>> combine(List<List<Integer>> l1, List<List<Integer>> l2) {
	int i; 
    if(l1 == null)
    	return l2;
    else if(l2 == null)
    		return l1;

    else {
    for(i = 0;i<Math.min(l1.size(), l2.size());i++) {
    	l1.get(i).addAll(l2.get(i));
    }
    if(l1.size()< l2.size())
    	l1.addAll(l2.subList(i,l2.size()));
    return l1;
    }
}
}