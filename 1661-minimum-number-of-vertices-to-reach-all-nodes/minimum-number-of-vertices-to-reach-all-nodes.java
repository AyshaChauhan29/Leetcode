class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] inDeg = new int[n];
        List<Integer> li = new ArrayList<>();
        
        for(List<Integer> ele : edges){
            inDeg[ele.get(1)]++;
        }
        
        for(int i=0; i<n; i++){
            if(inDeg[i] == 0) {
            li.add(i);
         }
        }
        return li;
    }
}

//Time is O(n + E) and space is O(n).