package com.lperthel.trees;

public class TreeNode {
     int val;
     public TreeNode left;
     public TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 public static TreeNode generateNaryTreeExample1() {
	 TreeNode root = new TreeNode(3);
	 TreeNode node2 =new TreeNode(9);
	 TreeNode node3 = new TreeNode(20);
	 TreeNode node4 =new TreeNode(15);
	 TreeNode node5 =new TreeNode(7);
	root.left = node2;
	root.right = node3;
	node3.left = node4;
	node3.right = node5;
	 
	 return root;
 
 }
 public static TreeNode generateThreeLevelBinarySearchTree() {
	 
	 TreeNode root = new TreeNode(5);
	 TreeNode node2 =new TreeNode(1);
	 TreeNode node3 = new TreeNode(4);
	 TreeNode node4 =new TreeNode(3);
	 TreeNode node5 =new TreeNode(6);
	root.left = node2;
	root.right = node3;
	node3.left = node4;
	node3.right = node5;
	 
	 return root;
 }
public static TreeNode[] generateFourLevelBinarySearchTreeArray() {
	 
	 TreeNode root = new TreeNode(6);
	 TreeNode node2 =new TreeNode(2);
	 TreeNode node3 = new TreeNode(8);
	 TreeNode node4 =new TreeNode(0);
	 TreeNode node5 =new TreeNode(4);
	 TreeNode node6 =new TreeNode(7);
	 TreeNode node7 =new TreeNode(9);
	 TreeNode node8 =new TreeNode(3);
	 TreeNode node9 =new TreeNode(5);
	 
	root.left = node2;
	root.right = node3;
	node2.left = node4;
	node2.right = node5;
node3.left = node6;
	node3.right = node7;
	node2.left = node4;
	node2.right = node5;
	
	node5.left = node8;
	node5.right = node9;
TreeNode[] nodes = {root, node2,node3,node4,node5,node6,node7,node8,node9};
return nodes;
 }
public static TreeNode generateDuplicateElementsTree() {
	 
	 TreeNode root = new TreeNode(2);
	 TreeNode node2 =new TreeNode(2);
	 TreeNode node3 = new TreeNode(2);
	root.left = node2;
	root.right = node3;
	 return root;
 
 }

@Override
public String toString() {
	return "TreeNode [val=" + val + "]";
}
 
 }
