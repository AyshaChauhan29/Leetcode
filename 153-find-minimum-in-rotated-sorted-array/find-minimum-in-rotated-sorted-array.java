class Solution {
    public int findMin(int[] nums) {
        //using binary search
        int n = nums.length;
        int low = 0;
        int min = nums[low];

        while(low < n-1){
            if(nums[low+1] < nums[low]){
                min = nums[low+1];
                low++;
            }
            low++;
           // min = Math.min(min, nums[low]);
        }
        return min;
    }
}