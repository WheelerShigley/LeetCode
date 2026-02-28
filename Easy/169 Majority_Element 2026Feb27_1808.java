import java.util.Arrays;

class Solution {
    public int majorityElement(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[ numbers.length/2 ];
    }
}