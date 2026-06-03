class Solution {
    public int findKthLargest(int[] nums, int k) {
        //By Sorting   ---> O(n log n)
        Arrays.sort(nums);   
        return nums[nums.length - k];   

        

    }
}