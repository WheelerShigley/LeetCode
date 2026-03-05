import java.util.Arrays;

class Solution {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);

        int length = citations.length;

        int h_index;
        for(int index = 0; index < length; index++) {
            h_index = length - index;
            if(h_index <= citations[index]) {
                return h_index;
            }
        }
        return 0;
    }
}