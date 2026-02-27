class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] magazine_letters = construction(magazine);
        int[] ransom_letters = construction(ransomNote);

        for(int i = 0; i < 26; i++) {
            if(magazine_letters[i] < ransom_letters[i]) {return false; }
        }
        return true;
    }
    private int[] construction(String lowercase_input) {
        int[] available_letters = new int[26];
        for(int i = 0; i < lowercase_input.length(); i++) {
            available_letters[ lowercase_input.charAt(i)-97 ]++;
        }
        return available_letters;
    }
}