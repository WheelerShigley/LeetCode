class Solution {
    public static int removeDuplicates(int[] sortedNumbers) {
        //input validation
        if(sortedNumbers.length <= 1) {
            return sortedNumbers.length;
        }

        //two-pointers approach
        int write_index = 0, read_index = 1;
        while(read_index < sortedNumbers.length) {
            if( sortedNumbers[read_index] != sortedNumbers[write_index] ) {
                write_index++;
                sortedNumbers[write_index] = sortedNumbers[read_index];
            }
            read_index++;
        }

        return write_index+1;
    }
}