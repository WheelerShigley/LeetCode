class Solution {
    public static int[] productExceptSelf(int[] numbers) {
        int[] products = new int[numbers.length];
        for(int index = 0; index < numbers.length; index++) {
            products[index] = 1;
        }

        int
            left_product_summation = 1,
            right_product_summation = 1
        ;
        for(int index = 0; index < numbers.length; index++) {
            products[index] *= left_product_summation;
            left_product_summation *= numbers[index];

            products[numbers.length-1-index] *= right_product_summation;
            right_product_summation *= numbers[numbers.length-1-index];
        }

        return products;
    }
}