class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] frequent =  new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap= new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        int index = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        while(!minHeap.isEmpty()){
            frequent[index++] = minHeap.poll().getKey();
        }
        
       
        return frequent;
        
    }
}