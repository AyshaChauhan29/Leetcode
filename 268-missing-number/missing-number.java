class Solution {
    public int missingNumber(int[] nums) {

        //sum of n natural no.
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;

        for(int ele : nums){
            set.add(ele);
        }

        for(int i=0; i<=n; i++){
            if(set.contains(i) == false){
                return i;
            }
        }
        
    /*    int expected = n * (n + 1) / 2;    // 1 SC   N-TC
        int sum = 0;
        for (int num : nums) sum += num;
        return expected - sum;             */
        return -1;
    }
}