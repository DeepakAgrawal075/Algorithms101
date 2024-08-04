package com.leetcode.tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxDepthBinaryTreeTest {
    Integer[] treeArray = {3, 9, 20, null, null, 15, 7};
    Tree tree = new Tree();

    @Test
    void givenBinaryTreeReturnsMaxDepth(){
        tree.root = TreeUtils.insertLevelOrder(treeArray, tree.root, 0);
        TreeUtils.printInOrder(tree.root);
        assertEquals(3, MaxDepthBinaryTree.maxDepth(tree.root));
    }
}