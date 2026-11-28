class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        int j = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key) == 1){
                ans[j] = key;
                j++;
            }
        }
        return ans;
    }
}