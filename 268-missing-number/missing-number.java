class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // int expSum = n * (n+1) / 2;
        // int sum = 0;

        // for(int i=0; i<n; i++){
        //     sum += nums[i];
        // }

        // return expSum-sum;

        int ans = 0;
        for(int i=0; i<n; i++){
            //XOR all the array elements and all the expected numbers
            ans = ans ^ i ^ nums[i];
        }
        return ans ^ n;
    }
}