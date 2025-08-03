class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int fresh = 0, rotten =0;
        int minutes = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(grid[i][j] == 2){
                    rotten++;
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
           
        }
         if(fresh == 0){
                return 0;
            }
       int[] dx = {1,0,-1,0};
       int[] dy ={0,1,0,-1};
        int min = 0;
        while(q.size() > 0){
            int size = q.size();
            for(int i =0;i<size;i++){
               int[] curr = q.poll();
                int nx = curr[0];
                int ny = curr[1];
            
            for(int j =0;j< 4;j++){
                int x = nx +  dx[j];
                int y =  ny +  dy[j];
                if(x >= 0 && y >=  0  &&  x < r && y <  c && grid[x][y] ==1){
                     grid[x][y] = 2;
                     q.offer(new int[]{x, y});
                     fresh--;
                     
                }
            }
            }

            if(!q.isEmpty()){
                minutes++;
            }
           
        }
        if(fresh == 0){
            return minutes;
        }

        return -1;
        
    }
}