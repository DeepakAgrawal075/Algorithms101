package com.leetcode.tree;

public class TreeUtils {
    public static TreeNode insertLevelOrder(Integer[] treeArray, TreeNode root, int i) {
        if (i < treeArray.length) {
            root = new TreeNode(treeArray[i]);

            root.left = insertLevelOrder(treeArray, root.left, 2 * i + 1);
            root.right = insertLevelOrder(treeArray, root.right, 2 * i + 2);
        }
        return root;
    }

    public static void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }
}
