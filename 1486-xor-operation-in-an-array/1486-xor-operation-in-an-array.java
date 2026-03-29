class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=start;
            start+=2;
        }
        int j=arr[0];
        for(int i=1;i<n;i++){
           j=j^arr[i];
        }
        return j;
    }
}