class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int len = nums.length;
        if (len % 2 != 0) return false;  

        int count[] = new int[101]; 
      
        for (int i = 0; i < len; i++) {
            count[nums[i]]++;
            if (count[nums[i]] > 2) 
                return false;
        }

      
        return true;
    }
}
