class Solution {
    public String longestCommonPrefix(String[] words) {
        StringBuilder prefix = new StringBuilder();
        Arrays.sort(words);
        String start = words[0], end = words[words.length-1];

        char current_character;
        for(int i = 0; i < Math.min( start.length(), end.length() ); i++) {
            current_character = start.charAt(i);
            if( current_character != end.charAt(i) ) { return prefix.toString(); }
            prefix.append(current_character);
        }
        return prefix.toString();
    }
}