class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
      int len = nums.length;
      int sum=0;
      for(int i=0;i<len;i++){
        if(nums[i]%2==0){
            sum= sum | nums[i];
        }
      }
      return sum;  
    }
}