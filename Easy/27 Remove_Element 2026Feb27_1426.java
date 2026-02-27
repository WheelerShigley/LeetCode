import java.util.ArrayList;
import java.util.List;

class Solution {
    /*
     * @return new [assumed] length of array
     */
    public static int removeElement(
        int[] array, int value_to_be_removed
    ) {
        List<Integer> correctedArray = new ArrayList<>();
        int occurence_count = 0;

        //construct corrected-array and get occurrence count
        for(int value : array) {
            if(value != value_to_be_removed) {
                correctedArray.add(value);
            } else {
                occurence_count++;
            }
        }

        //replace array
        for(
            int index = 0;
            index < array.length && index < correctedArray.size();
            index++
        ) {
            array[index] = (Integer)correctedArray.get(index);
        }

        return array.length-occurence_count;
    }
}