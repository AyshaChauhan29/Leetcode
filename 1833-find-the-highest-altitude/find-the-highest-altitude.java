class Solution {
    public int largestAltitude(int[] gain) {
      int n = gain.length;
      int maxA = 0;
      int sum = 0;

      for(int i=0; i<n; i++){
        sum += gain[i];
        maxA = Math.max(maxA, sum);
      }  
      return maxA;
    }
}