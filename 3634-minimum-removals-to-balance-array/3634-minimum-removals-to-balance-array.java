class Solution {
    public int minRemoval(int[] nums, int k) {
       int len = nums.length;
       Arrays.sort(nums);
       int left = 0;
       int right = 0;
    int size=0;
  for(int i=0;i<len;i++){
    while((long)nums[i] > (long)(k*nums[left])){
            left++;
        }
        right=(i-left+1);
        size = size > right ? size : right;
    }
    return len-size;
    }
}