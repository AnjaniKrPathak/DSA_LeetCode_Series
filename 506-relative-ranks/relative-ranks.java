class Solution {
    public String[] findRelativeRanks(int[] score) {
        Queue<int[]> maxHeap =  new PriorityQueue<>((a,b)-> (b[0] - a[0]));
        int n = score.length;
        String[] medals=  new String[n];
        for(int i=0;i< n;i++){
            maxHeap.offer(new int[]{score[i],i});
        }
        int rank = 1;
            while(!maxHeap.isEmpty()){
                int[] curr = maxHeap.poll();
                int idx = curr[1];
              
               if (rank == 1) {
            medals[idx] = "Gold Medal";
        } else if (rank == 2) {
            medals[idx] = "Silver Medal";
        } else if (rank == 3) {
            medals[idx] = "Bronze Medal";
        } else {
            medals[idx] = String.valueOf(rank);
        }
        rank++;
            
        }

        return medals;
        
    }
}