class Solution {
    public int majorityElement(int[] nums) {
    /*    int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];              */

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        // Find element with count > n/2
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }

        return -1; // No majority element found 

    }
}