package com.dsa.leetcode.sorting;

public class LeetCode33 {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target  = 0;
        int index = search(nums,target);
        System.out.print(index);

    }
    private  static int search(int[] input, int target){
        int low =0;
        int heigh = input.length-1;

        while(low <= heigh){
            int mid = (low + heigh ) / 2;

            if(target== input[mid]){
                return mid;
            }
            else if(input[low] <=input[mid]   ){
                if(input[low] <= target && target < input[mid]){
                    heigh =mid-1;
                }
                else low =mid+1;
            }
            else{
                if (input[mid]<target && target<= input[heigh]){
                    low =mid +1;
                }
                else{
                    heigh= mid-1;
                }

            }


        }
        return -1;

    }
}
