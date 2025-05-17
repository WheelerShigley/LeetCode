class Solution {
    public int climbStairs(int stair_count) {
        if(stair_count == 0) { return 0; }

        return fibonocci(stair_count);
    }
    private int fibonocci(int position) {
        int penultimate = 0, ultimate = 1; int temp;
        for(int i = 0; i < position; i++) {
            temp = ultimate;
            ultimate += penultimate;
            penultimate = temp;
        }

        return ultimate;
    }
}