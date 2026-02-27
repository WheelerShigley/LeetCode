class Solution {
    public String mergeAlternately(String First, String Second) {
        StringBuilder builder = new StringBuilder();
        int intersection = Math.min( First.length(), Second.length() );

        for(int i = 0; i < intersection; i++) {
            builder.append( First.charAt(i) ).append( Second.charAt(i) );
        }

        builder.append( First.substring(intersection) );
        builder.append( Second.substring(intersection) );

        return builder.toString();
    }
}