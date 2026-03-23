class Solution {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum_gas = 0, sum_cost = 0;
        for(int index = 0; index < gas.length; index++) {
            sum_gas += gas[index];
            sum_cost += cost[index];
        }
        //not possible
        if(sum_gas < sum_cost) {
            return -1;
        }

        // Given that it must be possible (after checking for possibility),
        // the position must be where the gas-total is greater than the cost-total
        sum_cost = 0;
        int starting_index = 0;
        for(int index = 0; index < gas.length; index++) {
            sum_cost += gas[index] - cost[index];
            if(sum_cost < 0) {
                sum_cost = 0;
                starting_index = index+1;
            }
        }
        return starting_index;
    }
}