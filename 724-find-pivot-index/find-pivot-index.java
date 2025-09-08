class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum =0;
       
        for(int n:nums){
            totalSum += n; 
        }
        int leftSum =0 , rightSum = 0;
        for(int i=0;i<nums.length;i++){
            leftSum  = totalSum - rightSum -nums[i];
            if(leftSum  == rightSum ){
                return i;
            } 
            rightSum = totalSum -leftSum;
        }

        return -1;
        

    }
}