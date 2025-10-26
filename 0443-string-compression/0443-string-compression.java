class Solution {
    public int compress(char[] chars) {
      int len = chars.length;

      String str="";
      char ch= chars[0];
      int count=1;
      for(int i=1;i<len;i++){
        char c=chars[i];
        if(c==ch){
            count++;
        }
        else{
            str=str+ch;
            if (count>1)
            str=str+count;
            ch=c;
            count=1;
        }
      }
      str=str+ch;
      if(count>1)
      str=str+count;
      for(int i=0;i<str.length();i++)
      chars[i]=str.charAt(i);

      return str.length();  
    }
}