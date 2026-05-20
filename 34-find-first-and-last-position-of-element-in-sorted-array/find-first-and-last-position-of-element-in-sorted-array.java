class Solution {
        
    public int[] searchRange(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int fi = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                fi = mid;
                high = mid - 1; // search on left side
            } 
            else if (nums[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }


         low = 0; 
         high = nums.length - 1;
        int li = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                li = mid;
                low = mid + 1; // search on right side
            } 
            else if (nums[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        int[] arr = new int[2];
        arr[0] = fi;
        arr[1] = li;

        return arr;
    }
}