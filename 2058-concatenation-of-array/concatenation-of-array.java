class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int index =0;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[index++] = nums[i];
           
        }
        for(int i=0;i<n;i++){
            ans[index++] = nums[i];
        }
        return ans;
        
    }
}