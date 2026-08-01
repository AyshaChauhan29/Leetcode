class Solution {

    static int score(int[] nums, int i, int j) {

        if (i == j) {
            return nums[i];
        }
       
        int left = nums[i] - score(nums, i + 1, j);
        int right = nums[j] - score(nums, i, j - 1);
        
        return Math.max(left, right);
    }

    public boolean predictTheWinner(int[] nums) {
       return score(nums, 0, nums.length - 1) >= 0;
    }
}