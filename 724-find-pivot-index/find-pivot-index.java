class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum =0;
        //int totalSum = 0;
        int totalSum  = Arrays.stream(nums).sum();
       // for(int num:nums){
          // totalSum +=  num;

       // }

        for(int i=0;i< nums.length;i++){
            rightSum = totalSum -leftSum -nums[i];
            if(leftSum == rightSum ){
                return i;
            }
            leftSum += nums[i];
        }

        return -1;

        
    }
}