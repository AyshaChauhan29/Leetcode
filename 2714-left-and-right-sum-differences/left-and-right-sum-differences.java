class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int sum = 0;

        int[] leftSum = new int[n];
        for(int i=0; i<n; i++){
            sum += nums[i];
            leftSum[i] = sum;
        }

        int[] rightSum = new int[n];
        sum = 0;
        for(int i=n-1; i>=0; i--){
            sum += nums[i];
            rightSum[i] = sum;
        }

        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int diff = Math.abs(leftSum[i] - rightSum[i]);
            answer[i] = diff;
        }
    return answer;

    }
}