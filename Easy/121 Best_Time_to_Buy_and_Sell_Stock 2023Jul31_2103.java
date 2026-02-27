class Solution {
    public int maxProfit(int[] prices) {
        int best_value = Integer.MIN_VALUE;

        int least_discovered = Integer.MAX_VALUE, current_cost, difference_temp;
        for(int i = 0; i < prices.length; i++) {
            current_cost = prices[i];
            if(current_cost < least_discovered) {
                least_discovered = current_cost;
                continue;
            }
            difference_temp = current_cost - least_discovered;
            if(best_value < difference_temp) {
                best_value = difference_temp;
            }
        }

        if(best_value < 0) { return 0; }
        return best_value;
    }
}