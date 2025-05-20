class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        for(int index = 0; index < nums.size(); index++) {
            if( nums.at(index) == val ) {
                nums.erase(nums.begin() + index--);
            }
        }
        return nums.size();
    }
};