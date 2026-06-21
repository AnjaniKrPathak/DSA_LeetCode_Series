class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index=  0;
        // setting non zero value
        for(int i=0;i<n;i++){
            if(nums[i] !=  0){
                nums[index++] = nums[i];
            }
        }
         // setting 0 value
        for(int i =index;i<n;i++){
            nums[index++] = 0;
        }
        
    }
}