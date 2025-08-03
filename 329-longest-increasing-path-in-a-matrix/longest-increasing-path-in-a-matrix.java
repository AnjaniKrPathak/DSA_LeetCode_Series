class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] res = new int[r][c];
        int ans = 0;
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                ans = Math.max(ans,dfs(matrix,res,i,j,r,c));
            }
        }

        return ans;

        
    }
    int  dfs(int[][] matrix,int[][] res,int i,int j,int r,int c){
        if(res[i][j] != 0){
            return res[i][j];
        }
        int val = matrix[i][j];
        int maxLength = 1;
        if(i > 0 && matrix[i-1][j] > val){
            maxLength =  Math.max(maxLength,1+dfs(matrix,res,i-1,j,r,c));
        }
        if(j > 0 && matrix[i][j-1] > val){
             maxLength =  Math.max(maxLength,1+dfs(matrix,res,i,j-1,r,c));
        }
        if(i < r-1 && matrix[i+1][j] > val){
             maxLength =  Math.max(maxLength,1+dfs(matrix,res,i+1,j,r,c));
        }
        if(j < c-1 && matrix[i][j+1] > val){
             maxLength =  Math.max(maxLength,1+dfs(matrix,res,i,j+1,r,c));
        }
            res[i][j] = maxLength ;
            return  maxLength;

        }
    
}