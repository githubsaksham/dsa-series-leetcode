class Solution {
    public boolean isAnagram(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();
        if(s_len!=t_len) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s_len;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0 ;i<t_len;i++){
            char ch =  t.charAt(i);
            if(!map.containsKey(ch)) return false;

            map.put(ch,map.get(ch)-1);
            if(map.get(ch) < 0) return false; 
        }

        return true;




        
    }
}