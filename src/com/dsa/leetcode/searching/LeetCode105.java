package com.dsa.leetcode.searching;

public class LeetCode105 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int peak = findPeakElement(nums);
    }

    private static int findPeakElement(int[] input) {
        for(int i =1;i<input.length-1;i++){
            if(input[i -1] < input[i] && input[i] > input[i+1] ){
                return i;
            }
            System.out.println(i);
        }
        return -1;

    }

}
