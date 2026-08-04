class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> li = new ArrayList<>();  

        HashSet<Integer> set = new HashSet<>();
        int min = nums[0];
        int max = nums[0];

        for (int ele : nums) {
            set.add(ele);

            if (ele < min) {
                min = ele;
            }

            if (ele > max) {
                max = ele;
            }
        }

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                li.add(i);
            }
        }

        return li;
    }
}