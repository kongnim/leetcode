class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = 10000;

        for (int i = 0; i < prices.length; i++) {

            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
            
        }

        return Math.max(maxProfit, 0);
    }
}