class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n =  nums.length;
        int[] res = new int[n];
        
        for(int i=0;i<n;i++){
            int leftSum =0;
            int rightSum =0;
            if(i>0 || i< n-1){
                for(int j=i-1;j>=0;j--){
                    leftSum += nums[j];


                }
                for(int k=i+1;k<n;k++){
                    rightSum += nums[k];
                }

            }

            res[i] = Math.abs(leftSum - rightSum);
        }
        return res;
        
    }
}