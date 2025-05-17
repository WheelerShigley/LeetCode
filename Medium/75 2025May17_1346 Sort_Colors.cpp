class Solution {
public:
    void sortColors(vector<int>& nums) {
        int red_count = 0, white_count = 0, blue_count = 0;
        //calculate counts for all "colors"
        int current_value, index;
        for(index = 0; index < nums.size(); index++) {
            current_value = nums[index];
            switch(current_value) {
                case 0:
                    ++red_count;
                    break;
                case 1:
                    ++white_count;
                    break;
                case 2:
                    ++blue_count;
            }
        }

        //calculate output
        vector<int> newNums;
        for(index = 0; index < red_count; index++) {
            newNums.push_back(0);
        }
        for(index = 0; index < white_count; index++) {
            newNums.push_back(1);
        }
        for(index = 0; index < blue_count; index++) {
            newNums.push_back(2);
        }

        //replace input with output
        nums = newNums;
    }
};