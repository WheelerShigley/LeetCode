class Solution {
    public static int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }

        int maximum_positive_difference = 0;
        int current_minimum = prices[0], current_difference;
        for(int price : prices) {
            if(price < current_minimum) {
                current_minimum = price;
            }

            current_difference = price - current_minimum;
            if(maximum_positive_difference < current_difference) {
                maximum_positive_difference = current_difference;
            }
        }
        return maximum_positive_difference;
    }
}