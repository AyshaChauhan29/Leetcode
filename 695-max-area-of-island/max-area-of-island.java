class Solution {
    static int sinkIsland(int[][] grid, int r, int c){
        // stop if outside the map or if this cell is water
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) return 0;

        grid[r][c] = 0;

        return 1 + sinkIsland(grid, r+1, c)     //down
                 + sinkIsland(grid, r-1, c)     //up
                 + sinkIsland(grid, r, c-1)     //left
                 + sinkIsland(grid, r, c+1);    //right

    }

    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxArea = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1){
                    int currArea = sinkIsland(grid, i, j);      // size of this island
                    maxArea = Math.max(maxArea, currArea);
                }
            }
        }
        return maxArea;
    }
}