class Solution {
    public int singleNumber(int[] numbers) {
        int pseudo_accumulator = 0;
        for(int i = 0; i < numbers.length; i++) {
            pseudo_accumulator ^= numbers[i];
        }

        return pseudo_accumulator;
    }
}