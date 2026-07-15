class Solution {

    //Recursively
    // a = oddSum = n*n
    // b = evenSum = n*(n+1)
    
    static int gcd(int a, int b){
       if(b == 0) return a;
       return gcd(b, a % b);
    }


    public int gcdOfOddEvenSums(int n) {
        return gcd(n*n, n*(n+1));
    }
}