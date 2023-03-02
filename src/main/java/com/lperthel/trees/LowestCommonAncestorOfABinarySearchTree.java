package com.lperthel.trees;

class LowestCommonAncestorOfABinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {    
		if(p.val< q.val)
			return lowestCommonAncestorHelper(root,p,q);
		else
			return lowestCommonAncestorHelper(root,q,p);
	}
	public TreeNode lowestCommonAncestorHelper(TreeNode root, TreeNode lower, TreeNode upper) {
    	if(root.val> lower.val  && root.val < upper.val ||
    			root.val == lower.val || root.val == upper.val)
    		return root;
    	else if(root.val > upper.val)
    	return lowestCommonAncestorHelper(root.left,lower,upper);
    else
    	return lowestCommonAncestorHelper(root.right,lower,upper);
    }
    
}