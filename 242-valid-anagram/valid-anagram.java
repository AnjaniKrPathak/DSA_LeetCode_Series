class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] schar= s.toCharArray();
        char[] tchar = t.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<schar.length;i++){
            map.put(schar[i],map.getOrDefault(schar[i],0)+1);
        }
        for(int i=0;i<tchar.length;i++){
            char ch =tchar[i];
              if (!map.containsKey(ch)) {
                return false;
            }
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }
             if (map.get(ch) == 0){
                map.remove(ch);
            }
        }

        return map.isEmpty();
        
    }
}