class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        // int prod = 1;
        // int max = Integer.MIN_VALUE;

        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         for(int k=j+1; k<n; k++){
        //             prod *= nums[i] * nums[j] * nums[k];
        //             max = Math.max(max, prod);
        //             prod = 1;
        //         } 
        //     }
        // }
        // return max;

        Arrays.sort(nums);

        int ans1 = nums[n-1] * nums[n-2] * nums[n-3];  //either three largest no. product
        int ans2 = nums[0] * nums[1] * nums[n-1];      //or two -ve and the largest

        return Math.max(ans1, ans2);
    }
}