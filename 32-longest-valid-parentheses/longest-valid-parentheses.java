class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int open = 0, close  = 0, ans =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                open++;

            }
            else{
                close++;
            }
            
            if(open == close){
                ans = Math.max(close+open, ans);
            }
            else if(close >open){
                open =0;
                close =0;
            }
        }
       open = 0; close  = 0; 
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == '('){
                open++;
            }
            else{
                close++;
            }
           
            if(open ==  close){
                 ans = Math.max(open+close,ans);
            }
             else if(open > close){
                open =0;
                close =0;
            }
        }


        return ans;

    }
}