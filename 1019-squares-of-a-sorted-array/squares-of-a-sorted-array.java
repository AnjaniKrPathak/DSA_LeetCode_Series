class Solution {
    public int[] sortedSquares(int[] nums) {
        int left =0 ;
        int right = nums.length-1;
        int[] res = new int[nums.length];
        int pos = nums.length-1;
        while(left <=  right){
            int valLeft = nums[left] *  nums[left];
            int valRight =  nums[right] *  nums[right];
            if(valLeft > valRight){
                res[pos--] = valLeft;
                left++;
            }else{
                res[pos--] =  valRight;
                right--;
            }
        }

        return res;
        
    }
}