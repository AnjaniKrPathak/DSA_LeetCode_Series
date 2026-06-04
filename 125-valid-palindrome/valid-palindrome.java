class Solution {
    public boolean isPalindrome(String s) {
        
        
       
        int low =0;
        int heigh = s.length()-1;
        while(low < heigh){
            while(low < heigh && !Character.isLetterOrDigit(s.charAt(low))){
                low++;
            }
            while(low < heigh && !Character.isLetterOrDigit(s.charAt(heigh))){
                heigh--;
            }
            if(Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(heigh))){
                return false;
            }
            low++;
            heigh--;
        }

        return true;
        
    }
}