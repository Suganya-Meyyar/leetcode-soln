class Solution {
    public int appendCharacters(String s, String t) {
       int i=0, j=0;
       int len = t.length();
       while(i<s.length() && j<len){
        if(s.charAt(i)==t.charAt(j)){
            j++;
        }
        i++;
       }
        return len-j; 
    }
}