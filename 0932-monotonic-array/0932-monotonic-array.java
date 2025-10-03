class Solution {
    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        // boolean arr[] = new boolean[len];
        boolean flag = true;
        boolean flag2 = true;
        for(int i = 0 ;i<len-1;i++){
            if(nums[i]<nums[i+1]){
                flag = false;
            }   
            if (nums[i]>nums[i+1])
            {
                flag2=false;
            }  
        }
        boolean bol = flag || flag2;
        return bol;
    }
}