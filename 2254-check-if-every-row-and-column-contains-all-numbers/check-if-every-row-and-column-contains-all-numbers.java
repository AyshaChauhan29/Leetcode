class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if (!set.add(matrix[i][j])) {
                    return false;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                if (!set.add(matrix[i][j])) {
                    return false;
                }
            }
        }

        return true;
    }
}