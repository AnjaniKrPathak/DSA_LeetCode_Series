class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n];
        int i =0 , j =0 , k =0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                nums[k++] =  nums1[i++];
            }
            else{
                nums[k++] =  nums2[j++];
            }
        }
        while(i < m){
            nums[k++] =  nums1[i++];
        }
        while(j < n){
            nums[k++] =  nums2[j++];
        }
        int index = 0;
        for(int num:nums){
            nums1[index++] =  num;
        }

        
    }
}