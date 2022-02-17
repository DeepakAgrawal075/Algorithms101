package com.leetcode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PathSumTest {

    /**
     * Integer[] treeArray = {5,4,8,11,null,13,4,7,2,null,null,null,1};
     *              5
     *            /   \
     *           4     8
     *          /     / \
     *         11    13  4
     *        / \         \
     *       7  2          1
     */

    int[] treeArray = {1, 2, 3, 4, 5, 6, 6, 6, 6, 6};

    /**
     *              1
     *            /   \
     *           2     3
     *          / \   / \
     *         4  5  6   6
     *        /\  /
     *       6 6 6
     */
    Tree tree = new Tree();

    @Test
    void givenBinaryTreeAndTargetSumReturnHasPathSum() {
        tree.root = insertLevelOrder(treeArray, tree.root, 0);
        printInOrder(tree.root);
        assertTrue(PathSum.hasPathSum(tree.root, 13));
        assertFalse(PathSum.hasPathSum(tree.root, 12));
    }

    private TreeNode insertLevelOrder(int[] treeArray, TreeNode root, int i) {
        if (i < treeArray.length) {
            root = new TreeNode(treeArray[i]);

            root.left = insertLevelOrder(treeArray, root.left, 2 * i + 1);
            root.right = insertLevelOrder(treeArray, root.right, 2 * i + 2);
        }
        return root;
    }

    private void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }
}