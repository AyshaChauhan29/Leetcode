class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // avoids integer overflow
            
            if (nums[mid] == target) {
                return mid;                
            } else if (nums[mid] < target) {
                left = mid + 1;            
            } else {
                right = mid - 1;           
            }
        }
        
        return left; // insertion point when not found 

        // bcoz the intersection of low > high so we will return low;

    }
}