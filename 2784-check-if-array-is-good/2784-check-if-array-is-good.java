class Solution {
    public boolean isGood(int[] nums) {
        int len = nums.length;
      Arrays.sort(nums);
      int max=0;
      int pos=len;
      if(len<2 || nums[len-1]!=nums[len-2])
      return false;
        for(int i=0;i<len-1;i++){
            if(nums[i]!=i+1){
                return false;
            }
        }
        return true;
       

    }
}