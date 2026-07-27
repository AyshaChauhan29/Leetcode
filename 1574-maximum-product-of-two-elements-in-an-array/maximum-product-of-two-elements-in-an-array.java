class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prod = 1;

        for(int i=0; i<n; i++){
            nums[i] -= 1;
        }

        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            prod = nums[n-1] * nums[n-2];
        }
        return prod;
    }
}