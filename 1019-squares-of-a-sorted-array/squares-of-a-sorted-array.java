class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int j = 0;

        for(int i=0; i<n; i++){
            res[j] = nums[i]*nums[i];
            j++;
        }

        Arrays.sort(res);
        for(int i=0; i<n; i++){
            nums[i] = res[i];
        }
        return nums;
    }
}