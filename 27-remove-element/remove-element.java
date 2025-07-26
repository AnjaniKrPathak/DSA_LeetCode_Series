class Solution {
    public int removeElement(int[] nums, int val) {
        int left =0;
        int right =nums.length-1;
        int k =0;
       
        while(left <=right){
            if(nums[left]!= val){
                nums[k] = nums[left];
                k++;

            }
            left++;
            
        }
        return k;
    }
       
}