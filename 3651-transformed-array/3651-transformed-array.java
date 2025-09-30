class Solution {
    public int[] constructTransformedArray(int[] nums) {
       int n=nums.length;
       if(n == 0) return new int[0];
       int res[]=new int[n];
       for(int i=0;i<n;i++){
        int t=nums[i];
        int pos;
        if(t>0){
          pos = (i+t) % n;
        }
        else {
            
            pos = ((i+t)%n +n)%n;
        }
        res[i]=nums[pos];
       }
       return res; 
    // for (int i = 0; i < n; i++) {
    //         int steps = nums[i];
    //         // Safe modulo that never gives negative index
    //         int newIndex = ((i + steps) % n + n) % n;
            
    //         res[i] = nums[newIndex];
    //     }
        
    //     return res;

    }
}