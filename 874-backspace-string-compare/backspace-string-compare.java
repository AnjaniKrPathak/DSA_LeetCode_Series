class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer>  st2 = new Stack<>();
        for(int i=  0;i< s.length();i++){
            if(s.charAt(i) == '#' ){
                if(!st1.isEmpty()){
                    st1.pop();

                }
                
            }
            else{
                st1.push(Character.getNumericValue(s.charAt(i)));
            }
        }
        for(int i=  0;i< t.length();i++){
            if(t.charAt(i) == '#'){
                if(!st2.isEmpty()){
                    st2.pop();

                }
                

            }
            else{
                st2.push(Character.getNumericValue(t.charAt(i)));
            }
        }


        return st1.equals(st2);
        
    }
}