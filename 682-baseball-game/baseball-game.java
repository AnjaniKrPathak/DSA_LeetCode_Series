class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int n = operations.length;
        for(int i=0;i<n;i++){
            String op =operations[i];
            if(op.equals("+")){
                int first = st.peek();
                int second =  st.get(st.size() -2);
                st.push(first+second);
            }
            else if(op.equals("D")){
                int res = st.peek();
                st.push(2* res);
            }
            else if(op.equals("C")){
                st.pop();
            }
            else {
                st.push(Integer.parseInt(op));
            }
        }
        int sum =0;
        while(!st.isEmpty()){
            sum +=  st.pop();

        }

        return sum;
        
    }
}