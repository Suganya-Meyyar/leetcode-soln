class Solution {
    public boolean judgeSquareSum(int c) {
      int a =0;
      int b = (int) Math.sqrt(c);
      int sum=0;
      while(a<=b){
        sum = a*a + b*b;
        if(sum==c)
        return true;
        else if(sum<c)
        a++;
        else
        b--;
      }
      return false;
    }
}