class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
       int arr[] = new int[len];
       int count=0; 
       for(int i=0;i<len;i++){
        if(nums[i]%2==0){
        arr[count]=nums[i];
        // nums[i]=-1;
        count++;
        }
       }
       for(int i=0;i<len;i++){
        if(nums[i]%2!=0){
        arr[count]=nums[i];
        count++;
        }
       }
       return arr;
    }
}