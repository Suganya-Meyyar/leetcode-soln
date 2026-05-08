class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
       int m = boxGrid.length;
       int n = boxGrid[0].length;

       char[][] arr = new char[n][m];

       for(char[] num : arr)
       Arrays.fill(num,'.'); 

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[j][m-i-1]=boxGrid[i][j];
        }
       }
       for(int col = 0; col<m ;col++){
        int one = n-1;

        for(int row = n-1;row>=0;row--){
            if(arr[row][col]=='*'){
                one = row-1;
            }
            else if (arr[row][col]=='#'){
                arr[row][col]='.';
                arr[one][col]='#';
                one--;
            }
        }
       }
       return arr;
    }
}