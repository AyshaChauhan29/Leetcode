class Solution {
    public int arrangeCoins(int n) {
       for(long i=1; i<=n; i++){
        long sum = i*(i+1)/2;
        if(sum == n) return (int)i;
        if(sum > n) return (int)i-1;
       }
       return n;
    }
}