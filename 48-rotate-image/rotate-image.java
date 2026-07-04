class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //taking transpose of the orig matrix
        int[][] ans = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans[j][i] = matrix[i][j];
            }
        }

    
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = ans[i][j];
            }
        }

        //reversing the transposed matrix to get the req matrix
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}