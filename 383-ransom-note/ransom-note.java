class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransom = new HashMap<>();
        for(char ch:ransomNote.toCharArray()){
            ransom.put(ch,ransom.getOrDefault(ch,0)+1);
        }
        for(char ch: magazine.toCharArray()){
            if(ransom.containsKey(ch)){
                ransom.put(ch,ransom.get(ch)-1);
                if(ransom.get(ch) == 0){
                    ransom.remove(ch);
                }
            }
        }

        return ransom.size() == 0;
        
    }
}