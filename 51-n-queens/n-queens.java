class Solution {

//  Checks whether a queen can be safely placed at (row, col)
    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;

        //check entire row
        for(int j=0; j<n; j++){
            if(board[row][j] == 'Q') return false;
        }

        //checking entire col
        for(int i=0; i<n; i++){
            if(board[i][col] == 'Q') return false;
        }

        
        //North-east diagonal -> move up and right
        int i = row;
        int j = col;

        while(i >= 0 && j < n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        //South-west diagonal -> move down and left
        i = row;
        j = col;
        while(i < n && j >= 0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }


        //North-west diagonal -> move up and left
        i = row;
        j = col;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }


        //South-east direction  -> move down and right
        i = row;
        j = col;
        while(i <n && j < n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }

       //and if no queen is attacking this position
       return true;
    }


    //this function is placing 1 queen in every row using backtracking
    public static void solve(char[][] board, int row, List<List<String>> ans){
        int n = board.length;

        //Base case: all n queens have been placed successfully
        if(row == n){
            //filling the ans list
           List<String> curr = new ArrayList<>();
           // Convert each board row into a String
           for(int i=0; i<n; i++){
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
            //if empty
            if(board[row][j] == '.'){
                if(isSafe(board, row, j) == true){
                    board[row][j] = 'Q';          // Choose: place/select the queen
                    solve(board, row+1, ans);     // Explore next row -> recursion 

                    board[row][j] = '.';          // Undo: remove queen and backtrack
                }
            }
        }
    }



    public List<List<String>> solveNQueens(int n) {
        // Create an n x n board
        char[][] board = new char[n][n];

        // Initially, every cell is empty
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();
        // Start placing queens from row 0
        solve(board, 0, ans);
        return ans;
    }
}