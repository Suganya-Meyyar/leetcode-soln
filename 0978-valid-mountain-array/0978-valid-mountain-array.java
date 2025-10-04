class Solution {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if (len < 3) return false;

        boolean incre = false;
        boolean decre = false;

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                // equal elements are not allowed in a mountain
                return false;
            }

            if (!decre) {
                if (arr[i] < arr[i + 1]) {
                    incre = true;
                } else if (arr[i] > arr[i + 1]) {
                    
                    if (!incre) {
                     
                        return false;
                    }
                    decre = true;
                }
            } else {
                
                if (arr[i] < arr[i + 1]) {
                   
                    return false;
                }
            }
        }
        return incre && decre;
    }
}
