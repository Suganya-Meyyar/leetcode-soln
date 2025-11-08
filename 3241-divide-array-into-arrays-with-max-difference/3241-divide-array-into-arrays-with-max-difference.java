class Solution {
    public int[][] divideArray(int[] nums, int k) {
       Arrays.sort(nums);
       int n =nums.length;
       int len=n/3;
       int [][] arr = new int[len][3];
       int count=0;
       boolean istrue = false;
       for(int i=0;i<len;i++){
        for(int j=0;j<3;j++){
            if(count+2<nums.length && nums[count+2]-nums[count]<=k && istrue==false )
            {
                // arr[i][j]=nums[count];
                istrue=true;
            }
            // count++;
            if(istrue){
                arr[i][j]=nums[count];
                count++;
            }
            else{
                return new int[0][0];
            }
            
        }
        istrue=false;
       } 
       return arr;
    }
}