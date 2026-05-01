class Solution {
    public int maxRotateFunction(int[] nums) {
        int len = nums.length;
        int sum=0,func=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
            func+=(i*nums[i]);
        }
        int max=func;
        for(int j=1;j<len;j++){
            func = func + sum - len*nums[len-j];
            max = Math.max(func,max);
        }
        return max;
    }
}