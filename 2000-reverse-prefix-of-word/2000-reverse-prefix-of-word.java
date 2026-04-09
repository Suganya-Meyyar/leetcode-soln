class Solution {
    public String reversePrefix(String word, char ch) {
   
      int len = word.length();
      int index = word.indexOf(ch);
      String str="";
      for(int i=index;i>=0;i--){
        str+=word.charAt(i);
      }
      for(int i = index+1;i<len;i++){
        str+=word.charAt(i);
      }
      return str;
    }
}