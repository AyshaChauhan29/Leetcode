class Solution {

    public void helper(int[] nums, List<Integer> curr, int i, List<List<Integer>> li){
        if(i == nums.length){
           li.add(new ArrayList<>(curr));
            return;
        }

        //pick
        curr.add(nums[i]);
        helper(nums, curr, i+1, li);

        // undo pick (backtrack)
        curr.remove(curr.size() - 1);

        // skip
        helper(nums, curr, i+1, li);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        helper(nums, new ArrayList<>(),  0,  li);
        return li;
    }
}