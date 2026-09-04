class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {

            // Find max from 0 to i
            int max = nums[0];

            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }

            // Find min from i to n-1
            int min = nums[i];

            for (int l = i; l < nums.length; l++) {
                min = Math.min(min, nums[l]);
            }

            // Instability score
            int diff = max - min;

            if (diff <= k) {
                return i;
            }
        }

        return -1;
    }
}