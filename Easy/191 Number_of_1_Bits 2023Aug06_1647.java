public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int input) {
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if( (input & 1) == 1 ) { count++; }
            input >>= 1;
        }

        return count;
    }
}