class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minHeap =  new PriorityQueue<>();
        int[] res = new int[nums.length];
        int index =0;
        for(int i=0;i< nums.length;i++){
            minHeap.offer(nums[i]);
        }
       while(!minHeap.isEmpty()){
            res[index++]=  minHeap.poll();
       }

       return res;
    }
}