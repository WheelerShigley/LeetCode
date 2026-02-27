class Solution {
    /* @param sorted array of integers
     * @return length of new, sorted array where there are (at most) two copies of each entry
     */
    public static int removeDuplicates(int[] numbers) {
        //input validation
        if(numbers.length <= 2) {
            return numbers.length;
        }

        // read positions, compare to two-positions before write-position for if it will be written-to or skipped
        int write_index = 2, read_index = 2;
        for(; read_index < numbers.length; read_index++) {
            if( numbers[read_index] != numbers[write_index-2] ) {
                numbers[write_index++] = numbers[read_index];
            }
        }

        return write_index;
    }
}