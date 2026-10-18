class Solution {

    static boolean count(int[][] grid, int r, int c, int x){
        int n = grid.length;

        if(x == n*n -1) return true;
        
        //2U + 1R
        int i = r-2;
        int j = c+1;
        if(i >=0 && j < n && grid[i][j] == x + 1){
            return count(grid, i, j, x+1);
        }

        //2U + 1L
        i = r-2;
        j = c-1;
        if(i >= 0 && j >= 0 && grid[i][j] == x + 1){
            return count(grid, i, j, x+1);
        }
        
        //2D + 1R
        i = r+2;
        j = c+1;
        if(i < n && j < n && grid[i][j] == x + 1){
            return count(grid, i, j, x+1);
        }
        
        //2D + 1L
        i = r+2;
        j = c-1;
        if(i < n && j >= 0 && grid[i][j] == x + 1){
            return count(grid, i, j, x+1);
        }

        //2R + 1U
        i = r-1;
        j = c+2;
        if(i >= 0 && j < n && grid[i][j] == x + 1){
            return count(grid, i, j, x+1);
        }

        //2R + 1D
        i = r+1;
        j = c+2;
        if(i < n && j < n && grid[i][j] == x + 1){
            return count(grid, i, j, x+1);
        }

        //2L + 1U
        i = r-1;
        j = c-2;
        if(i >= 0 && j >= 0 && grid[i][j] == x + 1){
            return count(grid, i, j, x+1);
        }

        //2L + 1D
        i = r+1;
        j = c-2;
        if(i < n && j >= 0 && grid[i][j] == x + 1){
             return count(grid, i, j, x+1);
        }

        return false;
    }


    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] != 0) return false;
        return count(grid, 0, 0, 0);
    }
}