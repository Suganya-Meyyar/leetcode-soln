class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        Arrays.fill(arr,-1);
        int len  = nums.length;
        boolean start = false , end = false;
        int max=-1;
        for(int i=0;i<len;i++){
            if(nums[i]==target && !start){
                arr[0]=i;
                start=true;
            }
            if (nums[i]==target ){
                max=i;
            }
        }
        arr[1]=max;
        return arr;
        
    }
}