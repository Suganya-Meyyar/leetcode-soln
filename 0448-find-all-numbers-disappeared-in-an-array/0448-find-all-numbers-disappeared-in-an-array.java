class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    //  Arrays.sort(nums);
     List<Integer> list = new ArrayList<>();
     int len = nums.length;
     HashSet<Integer> set = new HashSet<>();
     for(int i=0;i<len;i++){
        set.add(nums[i]);
     }
     for(int i=1;i<=len;i++){
        if(!set.contains(i)){
            list.add(i);
        }
     }
     return list; 
    }
}