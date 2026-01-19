class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        String arr[] = s.split(" ");
        int n = arr.length;
        String last="";
        for(int i=0;i<n ;i++){
            String str = arr[i];
            int m = str.length();
            String str2="";
            for(int j=m-1;j>=0;j--){
                str2=str2+str.charAt(j);
            }
            last=last+str2;
            if(i!=n-1){
                last=last+" ";
            }
        }
        // System.out.print(Arrays.toString(arr));
        // System.out.print(last);
        return last;
    }
}