class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[n-1];
        int min = Math.min(smallest, largest);
        int gcd = 1;

        for(int i=min; i>=1; i--){
            if(smallest%i==0 && largest%i==0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}