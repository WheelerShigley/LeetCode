public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int input) {
        int reversed = 0;
        for(int i = 0; i < 32; i++) {
            reversed += (input & 1) << (32-i-1);
            input >>= 1;
        }

        return reversed;
    }
}