class Solution {
    public int thirdMax(int[] nums) {
        Queue<Integer> minHeap =  new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i =0;  i < nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            minHeap.add(nums[i]);
            if(minHeap.size()  > 3){
                minHeap.poll();
            }
            
        }
        
        if(minHeap.size() ==  2){
            minHeap.poll();
        }

        return minHeap.peek();
        
    }
}