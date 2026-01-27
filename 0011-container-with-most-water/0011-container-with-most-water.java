class Solution {
    public int maxArea(int[] nums) {
        int len = nums.length;
        int left=0,right=len-1;
        int max=0;
        while(left<right){
          int  water = Math.min(nums[left],nums[right]) * (right-left);
           max = Math.max(max,water);

           if(nums[left]<nums[right]){
            left++;
           }
           else{
            right--;
           }

        }
        
        return max;
    }
}