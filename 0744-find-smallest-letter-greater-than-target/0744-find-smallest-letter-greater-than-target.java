class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        for(int i=0;i<len;i++){
            char ch = letters[i];
            if(ch>target)
            return ch;
        }
        return letters[0];
    }
}