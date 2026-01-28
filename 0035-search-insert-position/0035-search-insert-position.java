class Solution {
    public int searchInsert(int[] nums, int target) {
     int len = nums.length;
     int right = len -1 , left=0;
     int mid = 0;

     while(left<=right){
        mid = (left+right)/2;

        if(nums[mid]==target){
            return mid;
        }
        else if ( nums[mid]<target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }

        }
        return left;
     }   
    }
