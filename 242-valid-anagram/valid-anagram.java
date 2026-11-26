class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            char chS1 = s.charAt(i);
            char chS2 = t.charAt(i);
            map1.put(chS1, map1.getOrDefault(chS1, 0) + 1);
            map2.put(chS2, map2.getOrDefault(chS2, 0) + 1);
            
        }

        if(map1.equals(map2)){
            return true;
        }
        else return false;
        



    }
}