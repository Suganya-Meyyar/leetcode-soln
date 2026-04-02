class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int len = nums.length;
        long cont = 0;
        String str="";
        int left = 0;
        int right = len-1;
        while(left < right){
            int first = nums[left];
            int last = nums[right];
            str = String.valueOf(first)+last;
            cont = cont + Long.parseLong(str);
            left++;
            right--;

        }
        if(left==right){
            cont = cont + nums[left];
        }
        return cont;
    }
}