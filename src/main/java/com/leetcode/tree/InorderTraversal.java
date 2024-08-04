/**
 * 94. Binary Tree Inorder Traversal
 */
package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        inorderTraversal(root, inorderList);
        return inorderList;
    }

    private void inorderTraversal(TreeNode root, List<Integer> inorderList) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, inorderList);
        inorderList.add(root.val);
        inorderTraversal(root.right, inorderList);
    }
}
