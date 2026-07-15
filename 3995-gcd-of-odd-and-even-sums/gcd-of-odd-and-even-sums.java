class Solution {
    public int gcdOfOddEvenSums(int n) {
        // Odd sum: 1+3+5+... = n*n
        // int oddSum = n * n;
        
        // Even sum: 2+4+6+... = n*(n+1)
        // int evenSum = n * (n + 1);
        

        int oddSum = 0;
        int evenSum = 0;

        for(int i=1; i<=2*n-1; i+=2){
            oddSum += i;
        }

        for(int i=2; i<=2*n; i+=2){
            evenSum += i;
        }


        int min = Math.min(oddSum, evenSum);
        int gcd = 1;
        for(int i = min; i >= 1; i--) {  
            if(oddSum % i == 0 && evenSum % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}