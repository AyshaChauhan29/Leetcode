class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int[] arr = cardPoints;
      int n = arr.length;
      int lSum = 0;
      int max = Integer.MIN_VALUE;

      for(int i=0; i<k; i++){
        lSum += arr[i];
      }

      max = lSum;
      
      int rSum = 0;
      int li = n-1;
      for(int i=k-1; i>=0; i--){
        lSum -= arr[i];
        rSum += arr[li];
        li--;
        max = Math.max(max, lSum+rSum);
      }

      

      return max;
    }
}