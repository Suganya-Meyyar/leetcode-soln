class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int sum=1;
        int arr[]=new int[len];
        for(int j=0;j<len;j++){
        arr[j]=sum;
        sum=sum*nums[j];
        }
        int sum2=1;
        for(int j=len-1;j>=0;j--){
        arr[j]=sum2*arr[j];
        sum2=sum2*nums[j];
        }

        return arr;
    }
}