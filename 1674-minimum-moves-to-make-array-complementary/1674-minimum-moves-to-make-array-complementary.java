class Solution {
    public int minMoves(int[] nums, int limit) {
      int len = nums.length;
      int arr[] = new int[limit*2+2];

      for(int i=0;i<len/2;i++){
        int a = nums[i];
        int b = nums[len-1-i];
        
        int min = Math.min(a,b)+1;
        int max = Math.max(a,b)+limit;
        int sum = a+b;

        arr[2]+=2;

        arr[min]-=1;
        arr[sum]-=1;

       // arr[sum+1]+=1;
        arr[sum+1]+=1;

        arr[max+1]+=1;
      }

        int ans = Integer.MAX_VALUE;

        int curr = 0;

        for (int j = 2; j <= 2 * limit; j++) {

            curr += arr[j];

            ans = Math.min(ans, curr);
        }

        return ans;
      
    }
}