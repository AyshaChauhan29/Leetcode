class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];

        int m = mat.length;
        int n = mat[0].length;

        int row = 0;
        int max = -1;

        for(int i=0; i<m; i++){
            int ct = 0;
           for(int j=0; j<n; j++){
               if(mat[i][j] == 1){
                  ct++;
               }

               if(ct > max){
                 max = ct;
                 row = i;
               }
           }
           ans[0] = row;
           ans[1] = max;
        }
        return ans;
    }
}