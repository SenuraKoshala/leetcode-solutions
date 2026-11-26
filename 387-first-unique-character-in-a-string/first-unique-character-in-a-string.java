class Solution {
    public int firstUniqChar(String s) {

        char[] charArr = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : charArr){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < charArr.length; i++){
            if(map.get(charArr[i]) == 1){
                return i;
            }
            
        }

        return -1;
        
    }
}