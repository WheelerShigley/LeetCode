class Solution {
    public static void rotate(int[] numbers, int shift_count) {
        shift_count %= numbers.length;

        reverse(numbers, 0, numbers.length);
        reverse(numbers, 0, shift_count);
        reverse(numbers, shift_count, numbers.length);
    }

    private static void reverse(int[] array, int starting_index, int ending_index) {
        int temporary;
        for(int index = 0; index < (ending_index-starting_index)/2; index++) {
            temporary = array[index+starting_index];
            array[index+starting_index] = array[ending_index-index-1];
            array[ending_index-index-1] = temporary;
        }
    }
	/* ALTERNATE ARRANGEMENT
    private static void reverse(int[] array, int starting_index, int ending_index) {
        int temporary;
        while(starting_index < ending_index) {
            temporary = array[starting_index];
            array[starting_index] = array[ending_index];
            array[ending_index] = temporary;
            starting_index++; ending_index--;
        }
    }
	*/
}