class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
         int copy[] = new int[n];
         int j = 0;
          k = k % n;

        for(int i=n-k; i<n; i++){
          copy[j] = nums[i];
          j++;
        }

        for(int i=0; i<n-k; i++){
          copy[j] = nums[i];
          j++;
        }

        for(int i=0; i<n; i++){
          nums[i] = copy[i];
        }

    }
}