class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;

        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];

        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for(int i=2; i<n; i++){

            int x2 = coordinates[i][0];
            int y2 = coordinates[i][1];

            int a = (y1-y0)*(x2-x0);
            int b = (y2-y0)*(x1-x0);

            if(a != b) return false;
        }
        return true;
    }
}