class Solution {
    /*
     * @return truncated-length of array
     */
    public static int removeElement(
        int[] array, int value_to_be_removed
    ) {
        int write_index = 0, read_index = 0;
        for(int element : array) {
            if(element == value_to_be_removed) {
                read_index++;
            } else {
                array[write_index++] = array[read_index++];
            }
        }
        return write_index;
    }
}