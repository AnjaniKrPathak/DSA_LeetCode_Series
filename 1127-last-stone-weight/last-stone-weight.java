class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> maxHeap =  new PriorityQueue<>((a,b) ->b-a);
        for(int i =0;i<stones.length;i++){
            maxHeap.offer(stones[i]);
        }
        while(maxHeap.size() > 1){
            int y = maxHeap.poll();
            int x=  maxHeap.poll();
            if(x !=  y){
                maxHeap.offer(y-x);
            }
        }

        return maxHeap.isEmpty()? 0:maxHeap.peek();

        
    }
}