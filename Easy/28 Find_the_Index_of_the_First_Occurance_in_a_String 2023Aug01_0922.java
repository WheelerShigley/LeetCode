class Solution {
    public int strStr(String main_string, String substring) {
        int main_length = main_string.length(), sub_length = substring.length();

        if(main_length < sub_length) { return -1; }

        for(int i = 0; i <= main_length-sub_length; i++) {
            for(int j = 0; j < sub_length; j++) {
                if( main_string.charAt(i+j) != substring.charAt(j) ) { break; }
                if(j == sub_length-1) { return i; }
            }
        }
        return -1;
    }
}