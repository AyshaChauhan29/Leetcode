class Solution {

    static long isValid(int[][] grid, int i, int j){
        int row = grid.length;
        int col = grid[0].length;

        // out of grid, water, or already visited
        if(i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == 0) return 0;

        long sum = grid[i][j];
        grid[i][j] = 0;                 //mark visited

        sum += isValid(grid, i-1, j);   //up
        sum += isValid(grid, i+1, j);   //down
        sum += isValid(grid, i, j-1);   //left
        sum += isValid(grid, i, j+1);   //right

        return sum;
    }

    public int countIslands(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] > 0){
                    long sum = isValid(grid, i, j);
                    if(sum % k == 0) count++;
                }
            }
        }
        return count;
    }
}