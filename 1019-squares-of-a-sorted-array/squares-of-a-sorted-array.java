class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int[] res = new int[n];
        int idx = n-1;

        int low = 0;
        int high = n-1;
 
        while(low <= high){
            int loSq = nums[low] * nums[low];
            int hiSq = nums[high] * nums[high];

            if(loSq > hiSq){
                res[idx] = loSq;
                low++;
            }
            else{
                res[idx] = hiSq;
                high--;
            }
           idx--;
        }
        return res;
    }
}