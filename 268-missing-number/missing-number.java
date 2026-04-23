class Solution {
    public int missingNumber(int[] nums) {

        //sum of n natural no.
        
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) sum += num;
        return expected - sum;
    }
}