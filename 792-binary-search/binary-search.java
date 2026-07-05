class Solution {
    public int search(int[] nums, int target) {
        // starting index
        int left =  0;
        //  end index
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left) / 2;
            if(nums[mid] ==  target){
                return mid;
            }
            // target is small then skip right part
            else if(target < nums[mid]){
                //  update right value
                right = mid-1;
               
            }
            else{
                //update left value
                left =mid +1;
                
            }

        }

        return -1;
        
    }
}