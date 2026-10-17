class Solution {

    static void sinkIsland(char[][] grid, int r, int c){
        // stop if outside the map or if this cell is water
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0') return;

        grid[r][c] = '0';

        sinkIsland(grid, r+1, c);    //down
        sinkIsland(grid, r-1, c);    //up
        sinkIsland(grid, r, c-1);    //left
        sinkIsland(grid, r, c+1);    //right

    }

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int island = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == '1'){
                    island++;                     //found a new island
                    sinkIsland(grid, i, j);       //turn it into water
                }
            }
        }
        return island;
    }
}