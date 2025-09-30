class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        // for(int j=0;j<k;j++){
        //     int temp=nums[n-1];
        //     for(int i=n-1;i>0;i--){
        //         nums[i]=nums[i-1];
        //     }
        // nums[0]=temp;
        // }
        if(n==0)
        return;
        k=k%n;
        int arr[]=new int[n];
        int count=0;
        for(int i=n-k;i<n;i++){
            arr[count]=nums[i];
            count++;
        } 
        for(int i=0;i<n-k;i++){
            arr[count]=nums[i];
            count++;
        }   
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
     
    }
}