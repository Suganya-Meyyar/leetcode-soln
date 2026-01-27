class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        
         
            
        int sum=0;
        int track =  nums[0]+nums[2]+nums[1];
        Arrays.sort(nums);
        
        for(int i=0;i<len-2;i++){
            int left = i+1;
            int right=len-1;
            
            

            // if(i>0 && nums[i]==nums[i-1]){
            //     continue;
            // }
            while(left<right){
                sum = nums[i]+nums[left]+nums[right];
                // int dif = sum - target;
                // int abs = Math.abs(dif);
                if (Math.abs(target - sum) < Math.abs(target -track)) {
                    track = sum;
                }
                
                if(sum>target){
                    right--;
                }
                else if(sum<target)
                   left++;
                 else{
                    return sum;
            }
        }
        }
        
        return track;
    }
}