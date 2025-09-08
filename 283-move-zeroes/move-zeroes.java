class Solution {
    public void moveZeroes(int[] nums) {
        int right=nums.length-1;
        int left=0;
        int count=0;
        int k =0 ;
        while(left<=right){
            if(nums[left]!=0){
                nums[count] = nums[left];
                count++; 
            }
            left++;
            
        }
        for(int i=count;i<=right;i++){
            nums[i]=0;
        }
        
        
    }
}