class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        else {

            char[] char1Arr = s.toCharArray();
            char[] char2Arr = t.toCharArray();

            Arrays.sort(char1Arr);
            Arrays.sort(char2Arr);

            if(Arrays.equals(char1Arr, char2Arr)){
                return true;
            }
            else return false;

        }

       
        



    }
}