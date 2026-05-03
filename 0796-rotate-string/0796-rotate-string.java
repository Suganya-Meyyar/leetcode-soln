class Solution {
    public boolean rotateString(String s, String goal) {
        char arr[]=s.toCharArray();
        int len=s.length();
        int n=len;
        // for(int i=0;i<len;i++){
        //     char temp=arr[0];
        //   for(int j=0;j<len-1;j++){
        //     arr[j]=arr[j+1];
        //   }
        //   arr[len-1]=temp;
        //   String str=new String(arr);
        //   if(str.equals(goal)){
        //     return true;
        //   }  
        // }
        // return false;
        while(n>0){
            char temp=arr[0];
          for(int j=0;j<len-1;j++){
            arr[j]=arr[j+1];
          }
          arr[len-1]=temp;
          String str=new String(arr);
          if(str.equals(goal)){
            return true;
          }
          n--;
        }
        return false;
    }
}