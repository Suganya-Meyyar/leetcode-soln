class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,digsum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int n=nums[i];
            while(n>0){
                int rem =n%10;
                digsum=digsum+rem;
                n=n/10;
            }
        }
        return sum-digsum;
    }
}