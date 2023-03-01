package com.lperthel.trees;

import java.util.LinkedList;
import java.util.List;

public class BinarySearchLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root == null)
			return new LinkedList<>();
		else return levelOrderHelper(root);
	}
	
private List<List<Integer>> levelOrderHelper(TreeNode root) {
	List<List<Integer>> output= new LinkedList<>();
	List<List<TreeNode>> queues = new LinkedList<>();
	List<TreeNode> nextQueue, currentQueue= new LinkedList<>();
	List<Integer> currentOutput = new LinkedList<>();
	currentQueue.add(root);
	queues.add(currentQueue);
	int i = 0;
	while(i<queues.size()) {
		currentQueue = queues.get(i);
		nextQueue = new LinkedList<>();
		
		currentOutput = null;
		for(int k = 0;k<currentQueue.size();k++) {
			if(currentOutput == null) {
			currentOutput = new LinkedList< 					>();
					output.add(currentOutput);
			}
			TreeNode node = currentQueue.get(k);
			currentOutput.add(node.val);
			if(node.left!=null)
				nextQueue.add(node.left);
			if(node.right!=null)
				nextQueue.add(node.right);
		}
		if(!nextQueue.isEmpty())
			queues.add(nextQueue);
		i++;
	}
	return output;
	}
}