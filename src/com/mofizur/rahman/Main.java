package com.mofizur.rahman;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        BinarySearchTree tree = new BinarySearchTree();
//        tree.root = new TreeNode(1);
//        tree.root.left = new TreeNode (2);
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
//        System.out.println(tree.minDepth(tree.root));
//        ExcelTransform et=new ExcelTransform();
//        System.out.println(et.titleToNumber("O"));
//        System.out.println(et.convertToTitle(702));
//        ListNode a = new ListNode(2);
//        ListNode b = new ListNode(3);
//        ListNode c = new ListNode(4);
//        ListNode d = new ListNode(1);
//        ListNode e = new ListNode(5);
//        ListNode f = new ListNode(7);
//        a.next = b;
//        b.next = c;
//        d.next = e;
//        e.next = f;
//
//        LinkedList l = new LinkedList();
//        ListNode res = l.addTwoNumbers(a,d);
        Numbers n = new Numbers();
        int[] arr = {1, 3, 4, 5, 6, 7};
//        n.print(arr);
//        n.moveZeroes(arr);
//        n.print(arr);
//        System.out.println(n.removeElement(arr,1));

        System.out.println(n.containsDuplicate(arr));

    }
}
