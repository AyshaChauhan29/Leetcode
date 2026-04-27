class Solution {
    public int pivotIndex(int[] nums) {
    /*    int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // rightSum = totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;        */

      int n = nums.length;
      
      int[] pre = new int[n];     //initially {0, 0, 0, 0}
      int sum = 0;
      for(int i=0; i<n; i++){
        sum = sum + nums[i];
        pre[i] = sum;
      }
      
      int[] suff = new int[n];
      sum = 0;                        //no need to declare it again
      for(int i=n-1; i>=0; i--){
        sum = sum + nums[i];
        suff[i] = sum;
      }
       
         for(int i=0; i<n; i++) {
            if(pre[i] == suff[i]) return i;
         }
       return -1;
    }
}