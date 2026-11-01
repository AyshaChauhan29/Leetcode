class Solution {

    static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        //row
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        //col
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        //north-east diagonal
        int r = row;
        int c = col;
        while (r >= 0 && c < n) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c++;
        }

        //north-west diagonal
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c--;
        }

        //south-east diagonal
        r = row;
        c = col;
        while (r < n && c < n) {
            if (board[r][c] == 'Q')
                return false;
            r++;
            c++;
        }

        //south-west diagonal
        r = row;
        c = col;
        while (r < n && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r++;
            c--;
        }
        return true;
    }


    static void solve(char[][] board, int row, List<List<String>> ans){
        int n = board.length;
        if(row == n){
           List<String> curr = new ArrayList<>();
           
           for(int i=0; i<n ;i++){
            String str = "";
            for(int j=0; j<n; j++){
                str += board[i][j];
            }
            curr.add(str);
           }
           ans.add(curr);
           return;
        }


        for(int j=0; j<n; j++){
            if(board[row][j] == '.'){
                if(isSafe(board, row, j) == true){
                    board[row][j] = 'Q';
                    solve(board, row+1, ans);
                    board[row][j] = '.';
                }
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();
        solve(board, 0, ans);
        return ans;
    }
}