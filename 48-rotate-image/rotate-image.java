class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c =  matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] =  matrix[j][i];
                matrix[j][i] =  temp;
            }
        }
        for(int i=0;i<r;i++){
            int low =0,heigh = r-1;
            while(low < heigh){
                int temp = matrix[i][low];
                matrix[i][low] =  matrix[i][heigh];
                matrix[i][heigh] =  temp;
                low++;
                heigh--;
            }
        }

        
    }
}