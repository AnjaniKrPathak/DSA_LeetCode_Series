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
    int totalSum  = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Func(root,0,targetSum);
        
       
        return ans;
   
        
        
    }
     void Func(TreeNode root,int i ,int targetSum){
       
        if(root ==  null){
            return ;
        }
        i += root.val;

       
        
        if(root.left == null && root.right == null){

            totalSum += i;
            System.out.println(totalSum);
          
          if(i == targetSum){
            ans = true;
          }
            

        }
        Func(root.left,i,targetSum);
        Func(root.right,i,targetSum);

    }
}