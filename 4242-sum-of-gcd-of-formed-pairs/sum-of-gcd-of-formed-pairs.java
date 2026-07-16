class Solution {

    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public long gcdSum(int[] nums) {
       int n = nums.length;
        
       int[] prefGcd = new int[n];
       int currMax = nums[0];

       for(int i=0; i<n; i++){
         currMax = Math.max(currMax, nums[i]);
         prefGcd[i] = gcd(nums[i], currMax);
       }

       Arrays.sort(prefGcd);

       int low = 0;
       int high = n-1;
       long sum = 0;

       while(low < high){
        sum += gcd(prefGcd[low], prefGcd[high]);

          low++;
          high--;
       }
      return sum;
    }
}