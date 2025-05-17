class Solution {
    public void rotate(int[] numbers, int shift_count) {
        int size = numbers.length;
        shift_count %= size;

        //reversal method
        reverseArray(numbers, 0, size-shift_count-1);
        reverseArray(numbers, size-shift_count, size-1);
        reverseArray(numbers, 0, size-1);

        return;
    }
    public static void reverseArray(int[] numbers, int first, int last) {
        int int_temp;
        while(first < last) {
            int_temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = int_temp;

            first++; last--;
        }
    }
}