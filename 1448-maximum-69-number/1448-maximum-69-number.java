class Solution {
    public int maximum69Number (int num) {
        int temp=num;
        int sum=0,count=0, sem=0;
            while(num>0){
                count++;
                num=num/10;
            }
            num=temp;
                for(int j=count-1;j>=0;j--){
                    int dig=(int)Math.pow(10,j);
                   int first=num/dig;
                if(first==6){
                    return temp+3*dig;
                }
                num=num%dig;
                }
                return temp;
            }
           
        }
    
