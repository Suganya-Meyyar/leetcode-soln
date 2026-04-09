class Solution {
    public int repeatedNTimes(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap<>();
     int res=0;
     for(int i : nums){
        if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
            res=i;
            break;
        }
        else
        map.put(i,1);
     }
     return res;
    }
}