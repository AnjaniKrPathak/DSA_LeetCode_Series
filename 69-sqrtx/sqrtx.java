class Solution {
    public int mySqrt(int x) {
        if(x==0 || x== 1){
            return x;
        }
        int low =0;
        int heigh =x;
        int ans=0;
        while(low <= heigh){
            int mid =(low +heigh) /2;
            if(mid <= x/mid){
               low =mid +1;
               ans =mid;
            }
            else{
                heigh =mid -1;
            }

        }
        return ans;
        
    }
}