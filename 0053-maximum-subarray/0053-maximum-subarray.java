class Solution {
    public int maxSubArray(int[] nums) {
      int len = nums.length;
      int sum=0,max=Integer.MIN_VALUE;
      for(int i=0;i<len;i++){
        sum=Math.max(nums[i],sum+nums[i]);
        max=Math.max(sum,max);
      }

      return max;
    }
}