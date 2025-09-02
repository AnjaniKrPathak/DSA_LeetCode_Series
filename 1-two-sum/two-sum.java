class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                 map.put(nums[i],i);

            }
           
            int other=  target - nums[i];
            if(map.containsKey(other)){
                if(map.get(other)== i){
                    continue;
                }
                else{
                    res[0] = map.get(other);
                    res[1] =i;
                    return res;
                    
                }
            }

        }

        return res;
    }
}