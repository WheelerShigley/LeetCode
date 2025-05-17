class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minimum = ( word1.length() < word2.length() ) ? word1.length() : word2.length();

        StringBuilder merger = new StringBuilder();
        for(int i = 0; i < minimum; i++) {
            merger.append( word1.charAt(i) ).append( word2.charAt(i) );
        }
        merger.append(  word1.substring(minimum, word1.length() )  )
                .append(  word2.substring(minimum, word2.length() )  );

        return merger.toString();
    }
}