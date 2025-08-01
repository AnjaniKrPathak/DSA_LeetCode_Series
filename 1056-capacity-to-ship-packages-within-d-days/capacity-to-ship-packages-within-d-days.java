class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum =0;
        int n =weights.length;
        for(int i=0;i<n;i++){
            if(weights[i] > max){
                max = weights[i];
            }
            sum += weights[i];
        }
        int low =max;
        int heigh =sum;
        int ans =0;
        while(low<=heigh){
            int mid =(low +heigh) / 2;
            if(helper(mid,weights,n,days )){
                ans  = mid;
                heigh = mid-1;

            }
            else{
                low = mid+1;
            }
        }  
        return ans;  
    }
    private   boolean helper(int mid,int[] weight,int n ,int d){
            int sum =0, days =1;
            for(int i=0;i<n;i++){
                if(sum +weight[i] <=  mid) {
                    sum = sum + weight[i];
                }
                else {
                    days++;
                    sum = weight[i];
                }
            }
            if(days<= d){
                return true;

            }
            return false;
        }
}