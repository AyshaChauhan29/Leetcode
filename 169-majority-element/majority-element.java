class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // Arrays.sort(nums);
        // return nums[n/2];

        HashMap<Integer, Integer> map= new HashMap<>();

        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/2) return key;
        }
        return 0;
    }
}