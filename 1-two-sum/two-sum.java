class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i =0;i<n;i++){
        int complement = target - nums[i];
          if(map.containsKey(complement)){
            res[0] = map.get(complement);
            res[1] = i;
            return res;
          }
          map.put(nums[i],i);
       }

       return new int[]{-1,-1};
    }
}