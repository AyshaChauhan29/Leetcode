class Solution {

    public int count(char[][] board, int row, int col){
       int tc = 0;

       //for going up
       for(int i=row-1; i>=0; i--){
          if(board[i][col] == 'p'){
            tc++;
            break;
          }
           else if(board[i][col] == 'B') break;
       }


       //for going down
       for(int i=row+1; i<8; i++){
          if(board[i][col] == 'p'){
            tc++;
            break;
          }
           else if(board[i][col] == 'B') break;
       }
    
       //for going right
       for(int i = col+1; i< 8; i++){
            if(board[row][i] == 'p'){
                tc++;
                break;
            }
            else if(board[row][i] == 'B') break;
        }

        //for going left
        for(int i = col-1; i>=0; i--){
            if(board[row][i] == 'p'){
                tc++;
                break;
            }
            else if(board[row][i] == 'B') break;
        }

       return tc;
    }

    public int numRookCaptures(char[][] board) {
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(board[i][j] == 'R'){
                    return count(board, i, j);
                }
            }
        }
        return 0;
    }
}