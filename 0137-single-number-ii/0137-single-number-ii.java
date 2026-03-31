class Solution {
    public int singleNumber(int[] nums) {
      int len = nums.length;
      HashMap<Integer,Integer> set = new HashMap<>();
      for(int num : nums){
        if(set.containsKey(num)){
            set.put(num,set.get(num)+1);
        }
        else{
            set.put(num,1);
        }
      }
      for(int num :set.keySet()){
        if(set.get(num)==1)
        return num;

      }
      return 0;
    }
}