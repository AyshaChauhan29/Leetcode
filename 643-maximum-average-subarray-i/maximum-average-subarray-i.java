class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int n = nums.length;
      int max = Integer.MIN_VALUE;
      int sum = 0;

      for(int i=0; i<k; i++) sum += nums[i];
      max = sum;

      for(int i=1; i<=n-k; i++){
        sum -= nums[i-1];    //Outgoing index
        sum += nums[i+k-1];  //last valid index tk ka sum(next k)
        max = Math.max(max, sum);
      }
      return (double)max/k;
    }
}