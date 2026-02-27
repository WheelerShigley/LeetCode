class Solution {
    public List<String> summaryRanges(int[] numbers) {
        List<String> results = new ArrayList<>();
        int numbers_length = numbers.length;

        if(numbers_length <= 0) { return results; }

        int previous = numbers[0], current;
        String last_first_position = Integer.toString(previous);
        for(int i = 0; i < numbers_length; i++) {
            current = numbers[i];
            if(1 < Math.abs(current-previous)) {
                addRange(last_first_position,Integer.toString(numbers[i-1]),results);
                last_first_position = Integer.toString(current);
            }
            if(numbers_length-1 <= i) {
                addRange(last_first_position,Integer.toString(current),results);
                break;
            }
            previous = current;
        }

        return results;
    }
    private void addRange(String start, String end, List<String> list) {
        if(start.equals(end)) { list.add(start); return; }
        list.add(start+"->"+end); return;
    }
}