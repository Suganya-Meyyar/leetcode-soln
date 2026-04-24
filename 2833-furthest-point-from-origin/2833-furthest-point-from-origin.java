class Solution {
    public int furthestDistanceFromOrigin(String moves) {
       int len = moves.length();
       int left=0, right=0, blank=0;
       for(int i=0;i<len;i++){
        char ch = moves.charAt(i);
        if(ch=='L')
        left++;
        else if(ch=='R')
        right++;
        else 
        blank++;
       } 
       return Math.abs(right-left)+blank;
    }
}