class Solution {
    public int minimumCost(int[] cost) {
     Arrays.sort(cost);
     int sum=0;
     int len = cost.length;
    //  for(int i=0;i<len;i++){
    //     sum+=cost[i];
    //  }
     int count=0;
     for(int i=len-1;i>=0;i--){
        count++;
        sum+=cost[i];
        if(count==3){
        count=0;
        sum-=cost[i];
        }
     } 
     return sum;
    }
}