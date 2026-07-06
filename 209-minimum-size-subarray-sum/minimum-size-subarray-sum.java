class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int window = Integer.MAX_VALUE;
        int currSum = 0;

        for(int right=0; right<n; right++){
            currSum += nums[right];

            while(currSum >= target){
                //update
                window = Math.min(window, right-left+1);
                currSum -= nums[left];   //shrink
                left++;
            }
        }
        if(window == Integer.MAX_VALUE) return 0; 
        return window;
    }
}