class Solution {

    static final long MOD = 1000000007;

    static long countGoodInt(long x, long n) {

        if (n == 0) return 1;

        if (n % 2 == 0) {
            return countGoodInt((x * x) % MOD, n / 2);
        } 
        else {
            return (x * countGoodInt((x * x) % MOD, (n - 1) / 2)) % MOD;
        }
    }

    public int countGoodNumbers(long n) {
        long even = countGoodInt(5, (n + 1) / 2);
        long odd = countGoodInt(4, n / 2);

        return (int)((even * odd) % MOD);
    }
}