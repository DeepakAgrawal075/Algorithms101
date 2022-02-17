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

    Integer[] treeArray = {1, 2, 3, 4, 5, 6, 6, 6, 6, 6};

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
        tree.root = TreeUtils.insertLevelOrder(treeArray, tree.root, 0);
        TreeUtils.printInOrder(tree.root);
        assertTrue(PathSum.hasPathSum(tree.root, 13));
        assertFalse(PathSum.hasPathSum(tree.root, 12));
    }
}