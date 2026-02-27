class Solution {

    public int[] plusOne(int[] digits) {
        int[] new_digits = digits;

        //go through each necessary position, transferring the array and adding values
        boolean carry = true; //add one
        for(int i = digits.length-1; 0 <= i; i--) {
            if(carry) {
                if(digits[i] < 9) {
                    new_digits[i] = digits[i]+1;
                    carry = false;
                } else {
                    new_digits[i] = 0;
                    continue;
                }
            } else {
                new_digits[i] = digits[i];
            }
        }

        //if, after all the adding, there is still a carry: modify the return
        if(carry) {
            digits = new int[digits.length+1];
            digits[0] = 1;
            for(int i = 1; i < digits.length; i++) {
                digits[i] = new_digits[i-1];
            }
            return digits;
        }

        return new_digits;
    }
}