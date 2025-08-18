class Solution {
    public int lengthOfLastWord(String s) {
        String str[]=s.split(" ");
        String len=str[str.length-1];
        int len2=len.length();
        return len2;

    }
}