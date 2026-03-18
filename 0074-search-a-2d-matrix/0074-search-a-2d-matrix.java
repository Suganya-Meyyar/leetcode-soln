class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row = matrix.length;
       int col = matrix[0].length;

       int left = 0 ;
       int right = (row*col)-1;
       while(left<=right){
        int mid = (left+right)/2;
        int r  = mid/col;
       int c = mid%col;
        int res = matrix[r][c];
        if(res==target)
        return true;
        else if(res>target){
            right = mid-1;
        }
        else 
        left = mid+1;
       }
       return false;

    }
}