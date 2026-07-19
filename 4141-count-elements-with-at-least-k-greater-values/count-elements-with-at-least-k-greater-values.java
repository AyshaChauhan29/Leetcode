class Solution {
    public int countElements(int[] nums, int k) {
        int count = 0;
        int n  = nums.length;
        Arrays.sort(nums);

        if(k == 0) return n;
        int threshold = nums[n-k];  
        for(int i=0; i<n; i++){
            if(nums[i] < threshold) count++;
        }

        return count;
    }
}