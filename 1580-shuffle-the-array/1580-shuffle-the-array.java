class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int arr[] = new int[len];
        int count=0;
        int c=1;
        for(int i=0;i<len;i+=2){
            arr[i]=nums[count];
            count++;
           
        }int l=len/2;
        for(int i=l;i<len;i++){
            arr[c]=nums[i];
            c+=2;
        }
        return arr;
    }
}