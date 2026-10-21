class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        int max = 0;
        
        int[] rowSum = new int[row];

        for(int i=0; i<row; i++){
            
            for(int j=0; j<col; j++){
                rowSum[i] += accounts[i][j];
            }
            max = Math.max(max, rowSum[i]);
        }
        return max;
    }
}