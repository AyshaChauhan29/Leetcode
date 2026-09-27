class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minP = prices[0];
        int maxP = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int currProf = prices[i] - minP;
            minP = Math.min(minP, prices[i]);
            maxP = Math.max(maxP, currProf);
        }
        return maxP;
    }
}