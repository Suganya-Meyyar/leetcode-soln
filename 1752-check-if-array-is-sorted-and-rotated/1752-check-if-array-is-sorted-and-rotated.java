class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        int min = 0;
        for(int i=0;i<len;i++){
           if(nums[i]>nums[(i+1)%len])
           min++;

        }
        return min<=1;
    }
}