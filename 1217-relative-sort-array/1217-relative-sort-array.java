class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
      int len =arr1.length;
      int len2=arr2.length;
      int nums[] = new int[len];
      Arrays.sort(arr1);
      int count=0;
      for(int i=0;i<len2;i++){
        for(int j=0;j<len;j++){
            if(arr2[i]==arr1[j]){
                nums[count]=arr2[i];
                count++;
                arr1[j]=-1;
            }
        }
      }
for(int i=0;i<len;i++){
    if(arr1[i]!=-1){
        nums[count]=arr1[i];
        count++;
    }
}
return nums;
    }
}