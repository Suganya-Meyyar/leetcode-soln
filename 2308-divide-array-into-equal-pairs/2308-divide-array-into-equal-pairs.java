class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;

        int[] unique = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (nums[i] == unique[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == unique[i]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false; 
            }
        }

        return true;
    }
}
