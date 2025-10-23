class Solution {
    public int arrayNesting(int[] nums) {
        int len = nums.length;
        
        int l=0;
        for(int i=0;i<len;i++){
            int s=i;
            int c=0;
            while(nums[s]!=-1){
                int nex=nums[s];
                nums[s]=-1;
                s=nex;
                c++;

            }
            l=Math.max(c,l);
        }
        return l;

    }
}