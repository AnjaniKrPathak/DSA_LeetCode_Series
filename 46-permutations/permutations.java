class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        generatePermute(0,nums,new ArrayList<Integer>(),result);
        return result;
        
    }
    void generatePermute(int index,int[] nums,List<Integer> current,List<List<Integer>> result){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
           
        }
         for(int i=0;i < nums.length;i++){
            if(current.contains(nums[i])){
                continue;
            }
             current.add(nums[i]);
             generatePermute(i+1,nums,current,result);

        //  exclude 
              current.remove(current.size()-1);

        }
        
        
    }
}