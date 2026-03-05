import java.util.Arrays;

class Solution {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);

        int length = citations.length;
        int final_index = 0;
        //binary-search for the index where the value is smaller than the index
        int left_index = 0, right_index = length-1, middle_index;
        while(left_index <= right_index) {
            middle_index = (left_index+right_index)/2;
            if(length - middle_index <= citations[middle_index]) {
                final_index = Math.max(final_index, length-middle_index);
                right_index = middle_index-1;
            } else {
                left_index = middle_index+1;
            }
        }
        return  final_index;
    }
}