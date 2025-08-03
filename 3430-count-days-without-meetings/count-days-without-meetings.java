class Solution {
    public int countDays(int days, int[][] meetings) {

        int prevEnd = 0 , freeDays = 0;
        Arrays.sort(meetings,Comparator.comparing(m ->m[0]));
        for(int[] m:meetings){
            int s =m[0];
            int e = m[1];
            if(s > prevEnd){
                freeDays +=  s -prevEnd -1;
            }
                prevEnd = Math.max(prevEnd,e);
            

        }

        return freeDays + Math.max(0,days  - prevEnd);
        
    }
}