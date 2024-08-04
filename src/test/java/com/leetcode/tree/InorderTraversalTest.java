package com.leetcode.tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;

class InorderTraversalTest {
    InorderTraversal inorderTraversal = new InorderTraversal();

    @Test
    void givenNullTreeReturnsEmptyList() {
        assertEquals(Collections.emptyList(), inorderTraversal.inorderTraversal(null));
    }

    @Test
    void givenSingleNodeTreeReturnsSingleElementList() {
        TreeNode root = new TreeNode(1);
        assertEquals(Arrays.asList(1), inorderTraversal.inorderTraversal(root));
    }

    @Test
    void givenLeftSkewedTreeReturnsInorderList() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        assertEquals(Arrays.asList(3, 2, 1), inorderTraversal.inorderTraversal(root));
    }

    @Test
    void givenRightSkewedTreeReturnsInorderList() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        assertEquals(Arrays.asList(1, 2, 3), inorderTraversal.inorderTraversal(root));
    }

    @Test
    void givenBalancedTreeReturnsInorderList() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        assertEquals(Arrays.asList(4, 2, 5, 1, 6, 3, 7), inorderTraversal.inorderTraversal(root));
    }
}