class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
      List<int[]> ans = new ArrayList<>();
      int[]  temp = intervals[0];
      for(int i =0;i<intervals.length;i++){
        if(intervals[i][0] <= temp[1]){
            temp[1] = Math.max(temp[1],intervals[i][1]);
        }
        else{
            ans.add(temp);
            temp=intervals[i];
        }
      }
      ans.add(temp);
      return ans.toArray(new int[ans.size()][1]);

    }
}