class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used =  new boolean[nums.length];
        
        permutation(nums,used,new ArrayList<Integer>(), result);
        return result;

    }
     void  permutation(int[] nums,boolean[] used,List<Integer> current,List<List<Integer>> result ){
        if(current.size() == nums.length && !result.contains(current)){
            result.add(new ArrayList<Integer>(current));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i] ==  true){
                continue;
            }
            //if(i > 0 && nums[i] == nums[i-1] && !used[i-1]){
              //  continue;
            //}
            used[i] = true;

            current.add(nums[i]);
            permutation(nums,used,current,result);
            // backtracking 
            current.remove(current.size()-1);
            used[i] = false;
        }

    }
}