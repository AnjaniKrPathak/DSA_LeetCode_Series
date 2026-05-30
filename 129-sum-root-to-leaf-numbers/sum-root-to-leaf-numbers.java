/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum =0;
    public int sumNumbers(TreeNode root) {
        int curr= 0;
        trav(root,curr);
        return sum;

        
    }

    void trav(TreeNode root,int curr){
        if(root == null){
            return;
        }
        curr = curr *10 + root.val;
        if(root.left == null && root.right == null){
            sum = sum +curr;
        }
        trav(root.left,curr);
        trav(root.right,curr);
    }
}