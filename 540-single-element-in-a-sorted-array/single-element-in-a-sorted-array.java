class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        int low = 0;
    
        while(low < n-1){
            if(nums[low] == nums[low+1]) {
                low += 2;
            } 
            else return nums[low];
        }
        return nums[low];
    }
}