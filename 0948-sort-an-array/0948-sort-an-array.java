class Solution {
    public int[] sortArray(int[] nums) {
        // int len = nums.length;
        // for(int i=0;i<len-1;i++){
        //     int min = i;
        //     for(int j=i+1;j<len;j++){
        //         if(nums[min]>nums[j]){
        //           min=j;  
        //         }
        //     }
        //     int temp=nums[i];
        //     nums[i]=nums[min];
        //     nums[min]=temp;
        // }
        Arrays.sort(nums);
        return nums;
    }
}