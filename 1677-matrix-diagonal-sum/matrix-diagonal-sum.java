class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += mat[i][i];          //left diagonal
            sum += mat[i][n-1-i];      //right diagonal
        }

        if(n % 2 != 0){                //if mat is odd (say 5X5) then subtract the middle ele once
           int mid = n/2;
           sum -= mat[mid][mid];
        }
        return sum;
    }
}