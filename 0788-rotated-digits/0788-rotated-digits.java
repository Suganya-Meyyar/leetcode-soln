class Solution {
    public int rotatedDigits(int n) {
        if( n<=1)
        return 0;
        int count =0;

        for(int i=2;i<=n;i++){
        boolean res = isgood(i);
        if(res){
            count++;
        }
        }
        return count;
    }
    public boolean isgood(int n1){
        boolean flag=false;
        while(n1>0){
            int num = n1%10;
            if(num==2 || num==5 || num==6 || num==9){
                flag=true;
            }
            if(num==3 || num==7 || num==4 )
            return false;

            n1/=10;
        }
        return flag;
    }
}