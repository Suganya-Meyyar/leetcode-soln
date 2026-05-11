class Solution {
    public int[] separateDigits(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<len;i++){
            int n = nums[i];
            List<Integer> temp = new ArrayList<>();

            while(n>0){
                int rem = n%10;
                temp.add(rem);
                n/=10;
            }
            Collections.reverse(temp);
            list.addAll(temp);
        }
        int arr[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}