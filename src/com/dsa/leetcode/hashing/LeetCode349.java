package com.dsa.leetcode.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given two integer arrays nums1 and nums2,
 * return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 */
public class LeetCode349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2= {2,2};
        int[] res = intersection(nums1,nums2);
        Arrays.stream(res).forEach(x->System.out.print(x+" "));
    }

    /**
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2]
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int index = 0;

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);

        }
        for(int i=0;i<nums2.length;i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);

            }

        }
        int[] res = new int[set2.size()];
        for(int i:set2){
            res[index++] =i;


        }

        return res;

    }

}
