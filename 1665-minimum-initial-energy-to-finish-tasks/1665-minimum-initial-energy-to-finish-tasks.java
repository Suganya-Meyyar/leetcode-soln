class Solution {
    public int minimumEffort(int[][] tasks) {
       Arrays.sort(tasks, (a,b) -> (b[1] - b[0]) - (a[1]-a[0])); 
       int en =0;
       int res =0;
       for(int[] arr:tasks){
        int act = arr[0];
        int min = arr[1];

        if(en < min ){
            res+=(min-en);
            en = min;
        }
        en-=act;
       }
       return res;
    }
}
