class Solution {
    public int kthSmallest(int[][] matrix, int k) {
      Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
      int m = matrix.length;
      int n = matrix[0].length;
      for(int i=0;i<m;i++ ){
        for(int j=0;j<n;j++){
            max.add(matrix[i][j]);
            if(max.size()>k){
            max.poll();
        }
        }

      
      }

      return max.peek();
        
    }
}