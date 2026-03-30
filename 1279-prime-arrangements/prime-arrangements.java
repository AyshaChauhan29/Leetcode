class Solution {
    static final int MOD = 1_000_000_007;
    public int numPrimeArrangements(int n) {
        int primeCount = countPrimes(n);
        int nonPrimeCount = n - primeCount;
        return (int)(factorial(primeCount) * factorial(nonPrimeCount) % MOD);
    }

    private int countPrimes(int n) {
        if (n < 2) return 0;
        boolean[] isComposite = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) count++;
        }
        return count;
    }

    private long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result = result * i % MOD;
        }
        return result;
    }
}