package com.lperthel.trees;

import java.util.Stack;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
    	Integer lowerBound, upperBound;
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
    		if(lowerBound!=null && node.val<=lowerBound || upperBound !=null && node.val >= upperBound)
    		return false;
    			if(node.right !=null) {
    			lowerBoundStack.push(node.val);
    			upperBoundStack.push(upperBound);
    			nodes.push(node.right);
    		}
    		if(node.left!=null) {
    			upperBoundStack.push(node.val);
    			lowerBoundStack.push(lowerBound);
    			nodes.push(node.left);
    		}
    	}
    	return true;
    }
    }