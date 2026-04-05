class Solution {
    public boolean judgeCircle(String moves) {
    int len = moves.length();
    int x=0,y=0;
    for(int i=0;i<len;i++){
        char ch = moves.charAt(i);
        if(ch == 'U'){
            y++;
        }
       else  if(ch == 'D'){
            y--;
        }
      else if(ch == 'R'){
            x++;
        }
        else if(ch == 'L'){
            x--;
        }
    }
    return x==0 && y==0;
    }
}