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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=  new ArrayList<>();
        Queue<TreeNode>  q = new LinkedList<>();
        if(root == null){
            return result;
        }
        q.add(root);
        while(!q.isEmpty()){
            List<Integer>  level = new ArrayList<>();
            
            int levelSize = q.size();
            for(int i=0;i<levelSize;i++){
                TreeNode element = q.remove();
                if(i == levelSize-1){
                    result.add(element.val);
                }
                if(element.left !=  null){
                    q.add(element.left);
                }
                if(element.right !=  null){
                    q.add(element.right);
                }
            }

        }

        return result;
        
    }
}