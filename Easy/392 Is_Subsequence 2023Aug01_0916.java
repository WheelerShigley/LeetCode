class Solution {
    public boolean isSubsequence(String potential_subsequence, String primary_string) {
        int maximum_subsequence_position = potential_subsequence.length(),
                subsequence_position = 0, i;

        for(i = 0; i < primary_string.length(); i++) {
            if(maximum_subsequence_position <= subsequence_position) { break; }
            if( primary_string.charAt(i) == potential_subsequence.charAt(subsequence_position) ) {
                subsequence_position++;
            }
        }

        if(maximum_subsequence_position <= subsequence_position ) { return true; }
        return false;
    }
}