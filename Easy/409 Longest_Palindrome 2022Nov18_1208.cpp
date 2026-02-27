class Solution {
public:
    int longestPalindrome(string s) {
        //construct array (list) of alphabet positions
        int char_count[59] = {0};
        for(int pos = 0; pos < s.size(); pos++) { char_count[ s[pos]-65 ]++; } //assuming lower/upper case numbers (and 6-non letter characters)
        
        //up to one value can be odd, all the others need be even.
            //if any number is odd, +1 will be included at the end
        int result = 0;
        for(int pos = 0; pos < 58; pos++) {
            if(char_count[pos]%2 == 1) { result = 1; break; }
        }
            //include every occurances largest even number (num -= num%2)
        for(int pos = 0; pos < 58; pos++) {
            result += char_count[pos] - char_count[pos]%2;
        }
        
        return result;
    }
};