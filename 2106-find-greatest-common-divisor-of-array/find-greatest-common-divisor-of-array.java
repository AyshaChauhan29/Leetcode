class Solution {
    public int findGCD(int[] nums) {
    /*    int n = nums.length;
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
        return gcd;                    */


        
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[0];
        int b = nums[n-1];
        int gcd = 1;

        for(int i=a; i>1; i--){
            if(a%i==0 && b%i==0){
                return i;
            }    
        }
        return 1;
    }
}