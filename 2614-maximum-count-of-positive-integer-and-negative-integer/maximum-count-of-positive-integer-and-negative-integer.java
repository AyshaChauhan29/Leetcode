class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int minCt = 0;
        int maxCt = 0;

        for(int i=0; i<n; i++){
            if(nums[i] < 0) minCt++;
        }

        for(int i=0; i<n; i++){
            if(nums[i] > 0) maxCt++;
        }

        int max = Math.max(minCt, maxCt);
        return max;
    }
}