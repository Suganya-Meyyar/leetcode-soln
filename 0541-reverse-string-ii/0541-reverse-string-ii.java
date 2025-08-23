class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();
        int n=s.length();
        for(int j=0;j<s.length();j+=2*k){
                    int c=j;
                    int end = Math.min(j + k - 1, n - 1);
 
                for(int i=end;i>=j;i--){
                    char temp=arr[i];
                    arr[i]=arr[c];
                    arr[c]=temp;
                    c++;
                    if(c>=i)
                    break;
                }
                
            }
    
        
        String str=new String(arr);
        return str;
        
    }
}