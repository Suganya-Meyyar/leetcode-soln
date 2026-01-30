class Solution {
    public int[][] generateMatrix(int n) {
     int matrix[][] = new int[n][n];
        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        int count=1;

        while (left <= right) {

            for (int i = left; i <= right; i++) {
                matrix[top][i]=count;
                count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count;
                count++;
            }
            right--;

  
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = count;
                count++;
            }
            bottom--;


            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = count;
                count++;
            }
            left++;
    
        }
        return matrix;
 
    }
}