class Solution {

    static void helper(int[][] board, int row, int col, List<List<Integer>> ans) {

        // Moving up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) {
                ans.add(Arrays.asList(i, col));
                break;
            }
        }

        // Moving down
        for (int i = row + 1; i < 8; i++) {
            if (board[i][col] == 1) {
                ans.add(Arrays.asList(i, col));
                break;
            }
        }

        // Moving left
        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == 1) {
                ans.add(Arrays.asList(row, i));
                break;
            }
        }

        // Moving right
        for (int i = col + 1; i < 8; i++) {
            if (board[row][i] == 1) {
                ans.add(Arrays.asList(row, i));
                break;
            }
        }

        // Moving Top-left
        int i = row;
        int j = col;

        while (i >= 0 && j >= 0) {

            if (board[i][j] == 1) {
                ans.add(Arrays.asList(i, j));
                break;
            }

            i--;
            j--;
        }

        // Moving Top-right
        i = row;
        j = col;

        while (i >= 0 && j < 8) {

            if (board[i][j] == 1) {
                ans.add(Arrays.asList(i, j));
                break;
            }

            i--;
            j++;
        }


        // Moving bottom-left
        i = row;
        j = col;

        while (i < 8 && j >= 0) {

            if (board[i][j] == 1) {
                ans.add(Arrays.asList(i, j));
                break;
            }

            i++;
            j--;
        }


        // Moving bottom-right
        i = row;
        j = col;

        while (i < 8 && j < 8) {

            if (board[i][j] == 1) {
                ans.add(Arrays.asList(i, j));
                break;
            }

            i++;
            j++;
        }

        

    }

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] board = new int[8][8];

        for (int i = 0; i < queens.length; i++) {

            int r = queens[i][0];
            int c = queens[i][1];

            board[r][c] = 1;
        }
        int row = king[0];
        int col = king[1];

        helper(board, row, col, ans);

        return ans;
    }
}