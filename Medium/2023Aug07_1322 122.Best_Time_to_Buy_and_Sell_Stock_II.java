class Solution {
    public int maxProfit(int[] prices) {
        int accumulator = 0; //int todays_price, tomorrows_price;
        for(int i = 0; i < prices.length-1; i++) {
            //todays_price = prices[i]; tomorrows_price = prices[i+1];
            if(prices[i] < prices[i+1]) { accumulator += prices[i+1] - prices[i]; }
        }

        return accumulator;
    }
}