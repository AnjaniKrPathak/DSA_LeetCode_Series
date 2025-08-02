class Solution {
    int area = 0;
     int maxArea =0;
    public int maxAreaOfIsland(int[][] grid) {
        
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){ 
                if(grid[i][j] ==1){
                     area = 0;
                     dfs(grid,i,j,r,c);  
                     maxArea =  Math.max(maxArea,area);
                    
                     
                }
                

               
               
            }
        }

        return maxArea;
        
    }
    void   dfs(int[][] grid,int i,int j,int r,int c){
        if(i < 0 || j< 0 || i >= r || j >= c || grid[i][j] == 0){
            return;
        }
        
         grid[i][j] = 0;
         area++;
         dfs(grid,i,j+1,r,c);
         dfs(grid,i-1,j,r,c);
         dfs(grid,i,j-1,r,c);
         dfs(grid,i+1,j,r,c);

       
    }
}