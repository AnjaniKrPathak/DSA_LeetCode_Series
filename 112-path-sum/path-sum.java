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
    
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        pathSum(root,0,targetSum);
        return ans;
    }
    private void pathSum(TreeNode root,int i,int targetSum){
        if(root == null){
            return;
        }
         i += root.val;
        if(root.left == null && root.right == null){
           
            if(i ==  targetSum){
                ans  = true;
                return;
               
            }  

        }

        pathSum(root.left,i,targetSum);
        pathSum(root.right,i,targetSum);
    }
}