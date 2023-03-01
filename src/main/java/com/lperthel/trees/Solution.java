package com.lperthel.trees;

import java.util.Stack;

public class Solution {
    public boolean isValidBST(TreeNode root) {
    	Integer newLowerBound, newUpperBound, lowerBound, upperBound;
    	TreeNode node;
    	Stack<TreeNode> nodes = new Stack<>();
    	Stack<Integer> lowerBoundStack= new Stack<>();
    	Stack<Integer> upperBoundStack= new Stack<>();
    	boolean isValidTree = true;
    	nodes.push(root);
    	lowerBoundStack.push(null);
    	upperBoundStack.push(null);
    	while(isValidTree && !nodes.isEmpty()) {
    		node = nodes.pop();
    		lowerBound = lowerBoundStack.pop();
    		upperBound = upperBoundStack.pop();
    		if(lowerBound!=null && node.val<lowerBound || upperBound !=null && node.val > upperBound)
    			isValidTree = false;
    		if(node.right !=null) {
    			newLowerBound = lowerBound == null ? node.val : Math.max(lowerBound, node.val);
    			lowerBoundStack.push(newLowerBound);
    			upperBoundStack.push(upperBound);
    			nodes.push(node.right);
    		}
    		if(node.left!=null) {
    			newUpperBound = upperBound == null ? node.val : Math.min(upperBound,node.val);
    			upperBoundStack.push(newUpperBound);
    			lowerBoundStack.push(lowerBound);
    			nodes.push(node.left);
    		}
    	}
    	return isValidTree;
    }
    }