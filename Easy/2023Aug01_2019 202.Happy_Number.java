class Solution {
    public boolean isHappy(int current) {
        List<Integer> visited = new ArrayList<>();
        while( current != 1 && !visited.contains(current) ) {
            visited.add(current);
            current = sum_square_digits(current);
        }
        return (current == 1);
    }
    private int sum_square_digits(int number) {
        int accumulator = 0, digit;
        while(0 < number) {
            digit = number % 10;
            accumulator += digit*digit;
            number /= 10;
        }
        return accumulator;
    }
}