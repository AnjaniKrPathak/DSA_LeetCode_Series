class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
         k = k%n ;
         if(k > 0){
            rotatenum(nums,0,n-1);
            rotatenum(nums,0,k-1);
            rotatenum(nums,k,n-1);

         }
    }


        public   void rotatenum(int[] nums,int start,int end){
            while(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp ;
                 start++;
                 end--;
               
            }
            
         }
}