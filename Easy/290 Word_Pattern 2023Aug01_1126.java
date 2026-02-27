class Solution {
    public boolean wordPattern(String pattern, String sentence) {
        HashMap<Character,String> mapping = new HashMap<>();

        String[] words = sentence.split(" ");
        int word_count = words.length;
        if( pattern.length() != word_count ) { return false; }

        char current_pattern_character;
        for(int i = 0; i < word_count; i++) {
            current_pattern_character = pattern.charAt(i);
            if( mapping.containsKey(current_pattern_character) ) {
                if( !mapping.get( current_pattern_character ).equals(words[i]) ) { return false; }
            } else {
                if( mapping.containsValue(words[i]) ) { return false; }
                mapping.put(current_pattern_character, words[i]);
            }
        }
        return true;
    }
}