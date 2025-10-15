class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n=0,rem=0;
        for(int i=0;i<nums.length;i++){
            n=nums[i];
            ArrayList<Integer> temp = new ArrayList<>();
            while(n>0){
                rem=n%10;
                temp.add(rem);
                n=n/10;
            }
            Collections.reverse(temp);
            list.addAll(temp);
        }
        int[]  arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}