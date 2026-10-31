class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int[] pref = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            pref[i] = sum;
        }


        int[] suff = new int[n];
        sum = 0;
        for(int i=n-1; i>=0; i--){
            sum += nums[i];
            suff[i] = sum;
        }


        for(int i=0; i<n; i++){
            if(suff[i] == pref[i]) return i;
        }
        return -1;
    }
}