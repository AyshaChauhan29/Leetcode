class Solution {

    public static boolean isValid(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch)
                return false; // row
            if (board[i][col] == ch)
                return false; // column
        }
        int rGrid = row / 3 * 3;
        int cGrid = col / 3 * 3;
        for (int i = rGrid; i < rGrid + 3; i++) {
            for (int j = cGrid; j < cGrid + 3; j++) {
                if (board[i][j] == ch)
                    return false; // 3x3 box
            }
        }
        return true;
    }

    public static boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isValid(board, i, j, ch)) {
                            board[i][j] = ch;
                            if (solve(board))
                                return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}