class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>();
        int len= nums1.length;
        for(int i=0;i<len;i++){
            set.add(nums1[i]);
        }
        int len2 = nums2.length;

        for(int i=0;i<len2;i++){
            int n = nums2[i];
            if(set.contains(n)){
                inter.add(n);
            }
        }
return inter.stream().mapToInt(Integer::intValue).toArray();   
     }
}