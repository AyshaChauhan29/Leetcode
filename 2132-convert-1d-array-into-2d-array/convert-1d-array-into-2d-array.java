class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length;
    
        int[][] res = new int[m][n];
        // int[] row = new int[m];
        // int[] col = new int[n];

        // for(int i=0; i<m; i++){
        //     row[i] = original[i];
        // }

        // for(int i=n-1; i>=0; i--){
        //     col[i] = original[i];    
        // }

        // for(int i=0; i<m; i++){
        //     res[i][0] = row[i];    
        // }

        // for(int i=0; i<n; i++){
        //     res[0][i] = col[i];    
        // }

        if(len != m*n) {
           return new int[0][0];
        }
        
        int k = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[i][j] = original[k];
                k++;
            }
        }

        
        return res;
    }
}