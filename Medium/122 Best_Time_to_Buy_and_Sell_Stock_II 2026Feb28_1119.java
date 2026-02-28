class Solution {
    public static int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }

        int current_minimum = prices[0];
        int accumulated_profit = 0;
        for(int index = 1; index < prices.length; index++) {
            //valley
            if(prices[index] < prices[index-1]) {
                current_minimum = prices[index];
            }

            //final and peak
            if(prices.length-1 <= index) {
                if(current_minimum < prices[index]) {
                    accumulated_profit += prices[index] - current_minimum;
                }
                break;
            }

            //peak
            if(prices[index+1] < prices[index]) {
                accumulated_profit += (prices[index] - current_minimum);
                continue;
            }
        }
        return accumulated_profit;
    }
}