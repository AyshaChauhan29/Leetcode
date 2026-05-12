class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = prices[0];
        int maxProf =  0;

        for(int i=0; i<n; i++){
            int currProf = prices[i] - minPrice;
            minPrice = Math.min(minPrice, prices[i]);
            maxProf = Math.max(maxProf, currProf);
        }
        return maxProf;
    }
}