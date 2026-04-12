class Solution {
    public int findPeakElement(int[] nums) {
    /*    int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;   

            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;    */

        int n = nums.length;
        int max = Integer.MIN_VALUE;    //  -2^31
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
        }
        //find the index
        for(int i=0; i<n; i++){
            if(max == nums[i]){   //ans
                return i;
            }
        }
        return -1;
    }
}