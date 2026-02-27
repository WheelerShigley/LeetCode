class Solution {
    public static int removeDuplicates(int[] sortedNumbers) {
        //input validation
        if(sortedNumbers.length <= 1) {
            return sortedNumbers.length;
        }

        //two-pointers approach
        int previous_value = sortedNumbers[0];
        int read_index = 1, write_index = 1;
        for(int index = 1; index < sortedNumbers.length; index++) {
            if( sortedNumbers[read_index] == previous_value ) {
                read_index++;
            } else {
                previous_value = sortedNumbers[read_index];
                sortedNumbers[write_index++] = sortedNumbers[read_index++];
            }
        }

        return write_index;
    }
}