class Solution {
    public void setZeroes(int[][] matrix) {
     int row = matrix.length;
     int col = matrix[0].length;
     int[][] arr = new int[row][col];
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j]=matrix[i][j];
        }
     }
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(arr[i][j]==0)
            func(i,j,matrix);
        }
     }
    }
     public void func(int i,int j,int[][] matrix){
         int row = matrix.length;
     int col = matrix[0].length;
        for(int a=0;a<col;a++){
            matrix[i][a]=0;
        }
        for(int b=0;b<row;b++){
            matrix[b][j]=0;
        }
     }
  
}