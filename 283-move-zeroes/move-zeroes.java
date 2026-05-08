class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
    /*    int copy[] = new int[n];
        
        int j = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
               copy[j] = nums[i];
               j++;
            }
        }
        for(int i=0; i<n; i++){
            nums[i] = copy[i];
        }  
                                     */
    // stable using one pointer , no need of using two pointer
         int left = 0;

         for(int i=0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
         }
    }
}