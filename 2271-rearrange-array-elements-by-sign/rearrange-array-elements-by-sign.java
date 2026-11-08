class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

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

        return nums;
    }
}