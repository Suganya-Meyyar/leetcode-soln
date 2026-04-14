class Solution {
    public String multiply(String nums1, String nums2) {
        int m = nums1.length();
        int n = nums2.length();
        int arr[] = new int[m+n];
            for(int i = m-1;i>=0;i--){
                for(int j=n-1;j>=0;j--){
                    int prod = (nums1.charAt(i)-'0') * (nums2.charAt(j)-'0');
                    int sum = prod + arr[i+j+1];
                    arr[i+j+1]=sum%10;
                    arr[i+j]+=sum/10;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int num : arr){
                if(!(sb.length()==0 && num==0)){
                    sb.append(num);
                }
            }
        return sb.toString();
    }
}