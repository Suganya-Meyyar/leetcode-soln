class Solution {
    public int maxDistance(int[] colors) {
        int len = colors.length;
      int max=0;
        
        for(int i=len-1;i>=0;i--){
            if(colors[i]!=colors[0]){
                max = Math.max(max,i);
                break;
            }
        }
        for(int i=0;i<len;i++){
            if(colors[i]!=colors[len-1]){
                max = Math.max(max,n-i-1);
                break;
            }
        }
        return max;
    }
}