class Solution {
    public int maximumJumps(int[] nums, int target) {
       int len = nums.length;
       int arr[] = new int[len];
       Arrays.fill(arr,-1);
       int count =0;
     
       arr[0]=0;

       for(int i=1;i<len;i++){
        for(int j=0;j<i;j++){
        int res = Math.abs(nums[i]-nums[j]);

        if(res<=target && arr[j]!=-1){
            arr[i]=Math.max(arr[i],arr[j]+1);

        }
       } 
       }
       return arr[len-1];
    }
}