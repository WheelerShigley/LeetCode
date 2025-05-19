class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maximum = 0;
        int accumulator = 0;
        int current;
        for(int index = 0; index < nums.size(); index++) {
            current = nums.at(index);
            if(current == 1) {
                accumulator++;
            }
            if(current != 1 || nums.size() <= index+1) {
                if(maximum < accumulator) {
                    maximum = accumulator;
                }
                accumulator = 0;
            }
        }
        return maximum;
    }
};