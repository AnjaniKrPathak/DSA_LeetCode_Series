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
     
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> inOrderList = new ArrayList<>();
       
        inOrder(root,inOrderList);
        return inOrderList;
        
    }
    // traverse inOder
     void inOrder(TreeNode root,List<Integer> inOrderList){
        if(root == null){
            return;
        }
        inOrder(root.left,inOrderList);
        inOrderList.add(root.val);
        inOrder(root.right,inOrderList);
     }
}