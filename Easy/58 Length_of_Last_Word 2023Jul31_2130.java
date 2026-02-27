class Solution {
    public int lengthOfLastWord(String sentence) {
        int index = sentence.length()-1;
        for(; 0 <= index;) {
            if( sentence.charAt(index) != ' ' ) { break; }
            index--;
        }

        int length_counter = 0;
        for(; 0 <= index; index--) {
            if( sentence.charAt(index) == ' ' ) { return length_counter; }
            length_counter++;
        }
        return length_counter;
    }
}