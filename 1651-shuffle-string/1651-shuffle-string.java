class Solution {
    public String restoreString(String s, int[] indices) {
        if(s.length()!=indices.length){
            return null;
        }
        char arr[]=new char[s.length()];
        // char ch=s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++){
                 arr[indices[i]]=s.charAt(i);
                }

            String str=new String(arr);   
        return str;
    }
}