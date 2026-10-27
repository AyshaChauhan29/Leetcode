class Solution {

    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;

        //row check
        for(int j=0; j<n; j++){
            if(board[row][j] == 'Q') return false;
        }

        //col check
        for(int i=0; i<n; i++){
            if(board[i][col] == 'Q') return false;
        }

        //NE
        int i=row;
        int j=col;

        while(i >= 0 && j < n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        //Nw
        i=row;
        j=col;

        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }


        //SE
        i=row;
        j=col;

        while(i < n && j < n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }


        //SW
        i=row;
        j=col;

        while(i < n && j >= 0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        return true;
    }

    
    public static int solve(char[][] board, int row){
        int n = board.length;
        
        if(row == n) return 1;

        int count = 0;
        for(int j=0; j<n; j++){
            if(board[row][j] == '.'){
                if(isSafe(board, row, j)){
                    board[row][j] = 'Q';
                    count += solve(board, row+1);
                    board[row][j] = '.';
                }
            }
        }
        return count;
    }



    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        return solve(board, 0);
    }
}