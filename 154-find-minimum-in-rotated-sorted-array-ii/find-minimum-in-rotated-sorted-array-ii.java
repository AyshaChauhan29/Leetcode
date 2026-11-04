class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int low = 0;
        int min = nums[low];
        
        while(low < n-1){
            if(nums[low+1] < nums[low]){
                min = nums[low+1];
                low++;
            }
            low++;
        }
        return min;
    }
}