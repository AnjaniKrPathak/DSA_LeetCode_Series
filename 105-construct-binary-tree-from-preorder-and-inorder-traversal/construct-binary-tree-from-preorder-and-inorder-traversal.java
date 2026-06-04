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
    HashMap<Integer,Integer> map = new HashMap<>();
     int idx =0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return helper(preorder,inorder,0,inorder.length-1);
        
    }

    public TreeNode helper(int[] preorder,int[] inorder,int low,int heigh){
        if(low > heigh){
            return null;
        }
       
        int val =preorder[idx];
        idx++;

        TreeNode root = new TreeNode(val);
        int index = map.get(root.val);
        root.left = helper(preorder,inorder,low,index-1);
        root.right = helper(preorder,inorder,index+1,heigh);

        return root;


    }
}