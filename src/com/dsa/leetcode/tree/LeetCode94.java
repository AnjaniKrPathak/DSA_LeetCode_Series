package com.dsa.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
public class LeetCode94 {
    static List<Integer> inorderList =  new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root=new TreeNode();

        List<Integer> inorderList = inorderTraversal(root);

    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        inorderTrav(root);

        return inorderList;


    }

    private static void inorderTrav(TreeNode root) {
        if(root == null){
            return;
        }
        inorderTrav(root.left);
        inorderList.add(root.val);
        inorderTrav(root.right);
    }
}
