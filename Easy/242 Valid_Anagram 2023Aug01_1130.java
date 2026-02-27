class Solution {
    public boolean isAnagram(String first, String second) {
        int[] first_counts = count(first);
        int[] second_counts = count(second);

        return isEqual(first_counts, second_counts);
    }
    private int[] count(String lowercase_input) {
        int[] available_letters = new int[26];
        for(int i = 0; i < lowercase_input.length(); i++) {
            available_letters[ lowercase_input.charAt(i)-97 ]++;
        }
        return available_letters;
    }
    private boolean isEqual(int[] first, int[] second) {
        //known lengths of 26
        for(int i = 0; i < 26; i++) {
            if(first[i] != second[i]) { return false; }
        }
        return true;
    }
}