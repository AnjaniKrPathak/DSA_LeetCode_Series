class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];
       for(int i=0;i< n;i++){
        for(int j=0;j<n;j++){
            if(i!=  j && nums[i] + nums[j] == target){
                res[0] =i;
                res[1] = j;
                return res;
            }

        }
       }
       return new int[]{-1,-1}; 
    }
}