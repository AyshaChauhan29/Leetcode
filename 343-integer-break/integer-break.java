class Solution {
    public int integerBreak(int n) {
        //Greedy Approach
        // if(n <= 3) return n-1;

        // int ans = 1;

        // while(n > 4) {
        //     ans = ans * 3;
        //     n = n - 3;
        // }

        // ans *= n;

        // return ans;


        //DP
        int[] dp = new int[n+1];
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            for(int j=1; j<i; j++){
                dp[i] = Math.max(dp[i], j*Math.max(i-j, dp[i-j]));
            }
        }
        return dp[n];
    }
}