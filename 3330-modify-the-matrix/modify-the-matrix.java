class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {

    // Find maximum in current column
    int max = matrix[0][j];

    for (int i = 1; i < matrix.length; i++) {
        if (matrix[i][j] > max) {
            max = matrix[i][j];
        }
    }

    // Replace negative elements
    for (int i = 0; i < matrix.length; i++) {
        if (matrix[i][j] < 0) {
            matrix[i][j] = max;
        }
    }
}
return matrix;
    }
}