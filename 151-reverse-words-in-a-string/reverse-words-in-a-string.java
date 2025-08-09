class Solution {
    public String reverseWords(String s) {
      String[] st =  s.trim().split("\\s+");

        String[] res=new String[st.length];
        int index = 0;
        for(int i = st.length-1;i>= 0;i--){
            res[index] = st[i];
            index++;

        }
        
        String result = String.join(" ",res);

        return result;
        
    }
}