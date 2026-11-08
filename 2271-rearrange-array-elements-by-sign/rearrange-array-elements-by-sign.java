class Solution {
    public int[] rearrangeArray(int[] nums) {
    /*    int n = nums.length;

        int[] one = new int[n];
        int k = 0;

        int[] two = new int[n];
        int j = 0;

        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                one[k] = nums[i];
                k++;
            }
            else {
                two[j] = nums[i];
                j++;
            }
        }


        int idx = 0;

        for(int i=0; i<k; i++){
            nums[idx] = one[i];
            idx +=2;
        }

        idx = 1;

        for(int i=0; i<j; i++){
            nums[idx] = two[i];
            idx += 2;
        }

        return nums;    */


        int n = nums.length;

        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        for(int i = 0; i < n; i++) {

            if(nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            }
            else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        return ans;
    }
}