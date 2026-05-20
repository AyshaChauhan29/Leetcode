class Solution {

    // Find first occurrence
    public int findFirst(int[] nums, int target) {
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

        return fi;
    }


    // Find last occurrence
    public int findLast(int[] nums, int target) {
        int low = 0; 
        int high = nums.length - 1;
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

        return li;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }
}