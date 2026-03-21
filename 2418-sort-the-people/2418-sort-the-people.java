class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      int len = names.length;
      for(int i=1;i<len;i++){
        int key = heights[i];
        String key2 = names[i];
        int j=i-1;
        while(j>=0 && heights[j]>key){
            heights[j+1]=heights[j];
            names[j+1]=names[j];
            j--;
        }
        heights[j+1]=key;
        names[j+1]=key2;
      }  
      int left=0,right=len-1;
      while(left<right){
        String temp=names[left];
        names[left]=names[right];
        names[right]=temp;
        left++;
        right--;
      }
      return names;
    }
}