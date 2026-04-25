class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low =0;
        int heigh = numbers.length-1;
        int[] res =new int[2];
        int sum = 0;
        while(low < heigh){
            sum = numbers[low] +  numbers[heigh];
            if(sum == target){
                res[0] = low+1;
                res[1] =  heigh +1;
                break;
            }
            if(sum > target){
                heigh--;
            }
            if(sum < target){
                low++;
            }
            

        }
        return res;
        
    }
}