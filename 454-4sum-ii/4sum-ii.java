class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map1 = new HashMap<>();
        for(int n1:nums1){
            for(int n2:nums2){
                map1.put(n1+n2,map1.getOrDefault(n1+n2,0)+1);

            }
        }
       
        int count =0;
        for(int n3:nums3){
            for(int n4:nums4){
                int target = - (n3 + n4);
                count += map1.getOrDefault(target,0);
                
            }
        }
        return count;
        
    }
}