package com.dsa.leetcode.tree;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    /**
     * No Arg Constructor
     */
    public TreeNode() {
    }

    /**
     * All Arg Constructor
     * @param val
     * @param left
     * @param right
     */
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
