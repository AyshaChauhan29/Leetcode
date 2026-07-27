class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            nums[i] -= 1;
        }

        // Arrays.sort(nums);

        // for(int i=0; i<n; i++){
        //     prod = nums[n-1] * nums[n-2];
        // }
        // return prod;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                prod = nums[i] * nums[j];
                max = Math.max(max, prod);
            }
        }
        return max;
    }
}