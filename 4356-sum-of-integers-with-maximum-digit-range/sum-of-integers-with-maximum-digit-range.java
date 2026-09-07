class Solution {

    public int maxDigit(int x){
        int max = Integer.MIN_VALUE;
        while(x > 0){
            int rem = x % 10;
            if(rem > max){
                max = rem;
            }
            x = x/10;
        }
      return max;  
    }


    public int minDigit(int x){
        int min = Integer.MAX_VALUE;
        while(x > 0){
            int rem = x % 10;
            if(rem < min){
                min = rem;
            }
            x = x/10;
        }
     return min;   
    }

    
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int maxDigRan = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int diff = maxDigit(nums[i]) - minDigit(nums[i]);
            maxDigRan = Math.max(maxDigRan, diff);
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            int diff = maxDigit(nums[i]) - minDigit(nums[i]);
            if(diff == maxDigRan){
               sum += nums[i];
            }
        }
       return sum;
    }
}