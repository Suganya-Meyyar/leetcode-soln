class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length; //4

        int[] freq = new int[n + 1]; //[0,0,0,0,0]
        int[] ans = new int[n]; //[0,0,0,0]

        int common = 0;

        for (int i = 0; i < n; i++) {

            freq[A[i]]++; // i=2 [0,1,1,2,0] / 
            if (freq[A[i]] == 2) //
                common++; //1

            freq[B[i]]++;  //i=0 , 3 -> [0,2,2,2,0]
            if (freq[B[i]] == 2)
                common++; //2, 3

            ans[i] = common; // i=1 , [0,2,0,0]
        }

        return ans;
    }
}