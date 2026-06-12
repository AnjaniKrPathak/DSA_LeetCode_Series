class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n= matrix[0].length;
        int low = 0;
        int heigh = m*n-1;
        while(low <= heigh){
            int mid = low+(heigh-low)/2;
            int row = mid /n;
            int col =  mid % n;
            if(matrix[row][col] ==  target){
                return true;
            }
            else if(matrix[row][col] < target){
                low++;
            }else{
                heigh--;
            }

        }

        return false;
        
    }
}