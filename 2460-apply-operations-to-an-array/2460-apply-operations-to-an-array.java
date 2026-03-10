class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len-1;i++){            
            if(nums[i] == nums[i+1]){
                int temp=nums[i];
                nums[i] = temp*2;
                nums[i+1] = 0;
                }
            }
            int j=0;
        for(int i=0;i<len;i++){
         if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
         }   
        }
    
    return nums;
    }
}