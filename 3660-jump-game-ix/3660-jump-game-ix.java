class Solution {
    public int[] maxValue(int[] nums) {
        int len = nums.length;

        int[] arr = new int[len];
        int[] res = new int[len];

        arr[0] = nums[0];

        for(int i=1;i<len;i++){
            arr[i]= Math.max(arr[i-1],nums[i]);
        }
        int temp = Integer.MAX_VALUE;

        for(int i=len-1;i>=0;i--){
            if(arr[i]>temp){
                if(i==len-1)
                res[i]=arr[i];
                else
                res[i]=arr[i+1];
            }
            else
            res[i]=arr[i];
        
        temp = Math.min(temp , nums[i]);
        } return res;
    }
}