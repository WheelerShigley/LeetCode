class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size() != t.size()) { return false; } if(s.size() == 0) { return true; }
        
        //create arrays of "string-positions"
        int counts[2][27] = {0}; //assuming all lower-case characters input.
        for(int pos = 0; pos < s.size(); pos++) {
            counts[0][ s[pos]-97 ]++;
            counts[1][ t[pos]-97 ]++;
        }
        
        //sort both integer arrays (bubble sorts)
        int ssmallest, tsmallest,   sindex, tindex;
        for(int boths_pos = 0; boths_pos < 26; boths_pos++) {
            ssmallest = s.size()+1; tsmallest = t.size()+1; sindex = boths_pos, tindex = boths_pos;
            for(int left_most = boths_pos; left_most < 26; left_most++) {
                if(counts[0][left_most] < ssmallest) { ssmallest = counts[0][left_most]; sindex = left_most; }
                if(counts[1][left_most] < tsmallest) { tsmallest = counts[1][left_most]; tindex = left_most; }
            }
            //swap values
            int temp = counts[0][boths_pos]; counts[0][boths_pos] = counts[0][sindex]; counts[0][sindex] = temp; //s
                temp = counts[1][boths_pos]; counts[1][boths_pos] = counts[1][tindex]; counts[1][tindex] = temp; //t
        }
        
        //compare both arrays of integers (if equal, then they are isomorphic)
        for(int sorted_alpha = 0; sorted_alpha < 26; sorted_alpha++) {
            if( counts[0][sorted_alpha] != counts[1][sorted_alpha] ) { return false; }
        }
        
        //if never proven false, return true
        return true;
        
    }
};