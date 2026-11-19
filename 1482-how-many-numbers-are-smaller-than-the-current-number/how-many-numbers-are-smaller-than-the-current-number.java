class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int count = 0;

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(nums[j] < nums[i]) count++;
        //     }
        //     ans[i] = count;
        //     count = 0;
        // }
        // return ans;

        int[] temp = nums.clone();
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(temp[i])) { // only the FIRST occurrence
                map.put(temp[i], i);
            }
        }

        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }
}