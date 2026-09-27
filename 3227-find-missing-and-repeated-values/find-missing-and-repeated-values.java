class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] arr = new int[n*n];
        int k = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[k] = grid[i][j];
                k++;
            }
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        int[] ans = new int[2];

        for(int key : map.keySet()){
            if(map.get(key) > 1){
                ans[0] = key;
            }
        }


        for(int i=1; i<=n * n; i++){
           if(!map.containsKey(i)) {
             ans[1] = i;
           }
        }

        return ans;
    }
}