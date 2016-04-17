package com.mofizur.rahman;

/**
 * Created by Mofizur on 4/11/2016.
 */
public class BinarySearchTree {
    static TreeNode root;
    public BinarySearchTree(){
        root = null;
    }
    public int minDepth(TreeNode root){
        if(root==null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;

        if(root.left == null)
            return minDepth(root.right) + 1;

        if(root.right == null)
            return minDepth(root.left) + 1;

        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }
    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        else{
            int right = maxDepth(root.right);
            int left = maxDepth(root.left);
            return right>left?right+1:left+1;
        }
    }
}
