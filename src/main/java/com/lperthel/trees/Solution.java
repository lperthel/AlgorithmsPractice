package com.lperthel.trees;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	if(root.val> p.val  && root.val < q.val)
    		return root;
    	return null;
    	}
    
}