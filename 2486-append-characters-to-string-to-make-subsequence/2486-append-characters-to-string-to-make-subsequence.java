class Solution {
    public int appendCharacters(String s, String t) {
       int j=0;
       int len = t.length();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(t.indexOf(ch)==-1){
        break;
        }
        j++;
       }
        return len-j; 
    }
}