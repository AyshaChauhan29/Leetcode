class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int minDist = Integer.MAX_VALUE;
        boolean found = false;

        // Check every possible combination of 3 indices
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    // Check if all three values are equal
                    if (nums[i] == nums[j] && nums[j] == nums[k]) {
                        found = true;

                        // Calculate distance
                        int dist = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);

                        // Update minimum
                        if (dist < minDist) {
                            minDist = dist;
                        }
                    }

                }
            }
        }

        if (found) return minDist;
        else return -1;
    }
}