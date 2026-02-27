class Solution {
    public boolean isPalindrome(int base_two_input) {
        String base_ten_input = Integer.toString(base_two_input);
        int length = base_ten_input.length();
        for(int i = 0; i < length; i++) {
            if( base_ten_input.charAt(i) != base_ten_input.charAt(length-i-1) ) { return false; }
        }
        return true;
    }
}