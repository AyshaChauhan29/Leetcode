class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                   int diff1 = nums[j] - nums[i];
                   int diff2 = nums[k] - nums[j];
                   if(diff1 == diff && diff2 == diff) count++;
                
                }
            }

            
        }
        return count;
    }
}