class Solution {
    public static int jump(int[] distances) {
        int jump_count = 0;

        /* This approach iterates over the list, in groups, grouped by the minimum count of jumps it takes to arrive at those indexes.
         * This is found by selecting the next group as boarding the current one to the furthest reachable position;
         * that range is certain to be in the same group of minimum-count-of-jumps, as of the current jump count.
         * Once the end is reached, the search is over.
         */
        int left_index = 0, right_index = 0;
        int furthest_index = 0;
        while(right_index < distances.length-1) {
            for(int index = left_index; index <= right_index; index++) {
                furthest_index = Math.max(furthest_index, index + distances[index]);
            }

            left_index = right_index+1;
            right_index = furthest_index;
            jump_count++;
        }
        return jump_count;
    }
}