class Solution {
    public int[] productExceptSelf(int[] numbers) {
        int[] products_excluding_self = new int[numbers.length];
        int current_value;

        current_value = 1;
        for(int i = 0; i < numbers.length; i++) {
            products_excluding_self[i] = current_value;
            current_value *= numbers[i];
        }

        current_value = 1;
        for(int i = numbers.length-1; 0 <= i; i--) {
            products_excluding_self[i] *= current_value;
            current_value *= numbers[i];
        }

        return products_excluding_self;
    }
}