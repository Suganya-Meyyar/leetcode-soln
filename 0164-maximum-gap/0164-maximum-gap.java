class Solution {
    public int maximumGap(int[] nums) {
     int len = nums.length;
     Arrays.sort(nums);
     int dif=0;
     int max=0;
     for(int i=1;i<len;i++){
        dif=nums[i]-nums[i-1];
         max = dif>max?dif:max;
     } 
     return max;  
    }
}