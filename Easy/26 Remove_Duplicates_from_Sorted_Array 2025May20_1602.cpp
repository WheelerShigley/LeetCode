class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int unique_position = 1;
        for(int index = 1; index < nums.size(); index++) {
            if(nums[index-1] != nums[index]) {
                nums[unique_position++] = nums[index];
            }
        }
        return unique_position;
    }
};