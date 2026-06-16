class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,new ArrayList<Integer>(), result);
        return result;

    }
    void helper(int[] nums,int index,List<Integer> current,List<List<Integer>> result){
        if(!result.contains(current)){
            result.add(new ArrayList<>(current));
        }
        for(int i=index;i<nums.length;i++){
           current.add(nums[i]);
            helper(nums,i+1,current,result);
             
            current.remove(current.size()-1);
            helper(nums,i+1,current,result);
        }

    }
}