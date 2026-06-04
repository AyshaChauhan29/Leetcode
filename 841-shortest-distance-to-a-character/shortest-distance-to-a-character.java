class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
           int minDis = Integer.MAX_VALUE;

           for(int j=0; j<n; j++){
             if(s.charAt(j) == c){
                minDis = Math.min(minDis, Math.abs(i - j));
             }
           }
           ans[i] = minDis;
        }
        return ans;
    }
}