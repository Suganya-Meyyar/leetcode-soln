class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int l=len+len;
        int[] arr = new int[l];
        for(int i=0;i<len;i++){
            arr[i]=nums[i];
        }
        int count=0;
        for(int i=len;i<l;i++){
            arr[i]=nums[count];
            count++;
        }
        return arr;
    }
}