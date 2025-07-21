class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        
        findPartion(s,0,new ArrayList<String>(),result);
        return result;
        
    }
    void findPartion(String s,Integer start,ArrayList<String> temp,List<List<String>> result){
         if(start==s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int end=start+1;end<=s.length();end++){
             String subString = s.substring(start,end);
             if(isPalindrome(subString)){
                 temp.add(subString);
              findPartion(s,end,temp,result);
              temp.remove(temp.size()-1);

             }
            
             

        }
       

      }
      boolean isPalindrome(String str) {
    int i = 0, j = str.length() - 1;
    while (i < j) {
        if (str.charAt(i++) != str.charAt(j--)) return false;
    }
    return true;
      }
      
}