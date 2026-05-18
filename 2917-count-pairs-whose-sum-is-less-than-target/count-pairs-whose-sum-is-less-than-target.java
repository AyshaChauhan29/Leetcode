class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        // Collections.sort(nums);
        
        // int low = 0;
        // int high = n-1;
        // int count = 0;

        // while(low < high){
        //     if(nums.get(low) + nums.get(high) < target) {
        //         count += high-low;
        //         low++;
        //     }
        //     else {
        //         high--;
        //     }
        // }
        // return count;

        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}