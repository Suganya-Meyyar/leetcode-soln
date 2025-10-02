class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m+n;
        // int arr[] = new int[len];
        // for(int i=0;i<m;i++){
        //     arr[i]=nums1[i];
        // }
        for(int i=m;i<len;i++){
            nums1[i]=nums2[i-m];

        }
        Arrays.sort(nums1);
        // for(int i=0;i<len;i++){
        //     nums1[i]=arr[i];
        // }
    }
}