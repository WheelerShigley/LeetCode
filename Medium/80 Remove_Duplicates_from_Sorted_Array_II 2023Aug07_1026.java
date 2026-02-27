class Solution {
    public int removeDuplicates(int[] numbers) {
        int previous_count = 0, previous_value = Integer.MIN_VALUE, current_value, position = 0;
        for(int i = 0; i < numbers.length; i++) {
            current_value = numbers[i];

            if(previous_value == current_value) { previous_count++; } else { previous_count = 0; }
            if(previous_count < 2) { position++; }
            numbers[position-1] = current_value;

            previous_value = current_value;
        }

        return position;
    }
}