class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
            
        }

        Map.Entry<Integer, Integer> result =
        map.entrySet()
           .stream()
           .max(Map.Entry.comparingByValue())
           .get();
           

        return result.getKey();                             
                                         
        
    }
}