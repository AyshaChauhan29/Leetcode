class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    /*    int maxWbot = 0;
        int ans = numBottles / numExchange;
        maxWbot = maxWbot + ans + 1;
        return numBottles + maxWbot;    */

        int total = numBottles;
        int empty = numBottles;

        while(empty >= numExchange){
            int newBottles = empty / numExchange;
            total += newBottles;
            empty = (empty % numExchange) + newBottles;
        }
        return total;
    }
}