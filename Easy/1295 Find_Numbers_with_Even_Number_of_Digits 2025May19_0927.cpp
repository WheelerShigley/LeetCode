class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int evenLengthDigitCount = 0;
        int cast_size;
        for(int index = 0; index < nums.size(); index++) {
            cast_size = static_cast<int>(
                log10( nums.at(index) )
            );
            if(cast_size%2 == 1) {
                evenLengthDigitCount++;
            }
        }
        return evenLengthDigitCount;
    }
};