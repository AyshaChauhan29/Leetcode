class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
    /*    int max = Integer.MIN_VALUE;
    
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
            if(max >= 2*nums[i]) {
                return i;
            }
        }
        return -1;   */
        int max = nums[0];
        int maxIndex = 0;
 
        for(int i=0; i<n; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] == max){
            nums[i] = -1;
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] > max/2){
              return -1;
            }
        }

     return maxIndex;

    }
}