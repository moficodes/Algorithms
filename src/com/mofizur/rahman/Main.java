package com.mofizur.rahman;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode (2);
//        tree.root.left.left = new TreeNode (3);
//        tree.root.left.right = new TreeNode (4);
//        tree.root.left.left.left = new TreeNode (5);
//        tree.root.right = new TreeNode(18);
//        tree.root.right.left = new TreeNode(10);
//        tree.root.right.right = new TreeNode(11);
//        tree.root.right.left.left = new TreeNode(8);
//        tree.root.right.left.right = new TreeNode(9);
//        tree.root.right.right.right = new TreeNode(13);
//        tree.root.right.right.right.right = new TreeNode(15);
        System.out.println(tree.minDepth(tree.root));

    }
}
