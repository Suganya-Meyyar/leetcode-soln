class Solution {
    public int minElement(int[] nums) {
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            int dig = nums[i];
            int sum =0;
            while(dig>0){
                int rem = dig%10;
                sum+=rem;
                dig/=10;
            }
            nums[i]=sum;
        }
        for(int i=0;i<len;i++){
            min = Math.min(min,nums[i]);
        }
        return min;
    }
}