class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
       // int sum = 0;

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

      for(int i=0; i<n; i++){
        if(pre[i] == suff[i]) return i;
      }
       return -1;
    }
}