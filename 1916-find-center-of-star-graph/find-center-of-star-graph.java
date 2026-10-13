class Solution {
    public int findCenter(int[][] edges) {
    /*    HashSet<Integer> set = new HashSet<>();
        int row = edges.length;
        int col = 2;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(set.contains(edges[i][j])){
                    return edges[i][j];
                }else{
                    set.add(edges[i][j]);
                }
            }
        }
        return -1;        */


        //edges[i][0] is the first node of edge i.
        //edges[i][1] is the second node of edge i.
        int a = edges[0][0];
        int b = edges[0][1];

        if(a == edges[1][0] || a == edges[1][1]) return a;
        return b;
    }
}