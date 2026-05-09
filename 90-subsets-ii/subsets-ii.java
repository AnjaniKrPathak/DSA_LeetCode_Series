class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        combi(nums,0,new ArrayList<>(),result);
        return result;

        
    }
    void combi(int[] nums,int index,List<Integer> current,List<List<Integer>> result){
        if(!result.contains(current)){
            result.add(new ArrayList<>(current));
            

        }
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            combi(nums,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
}