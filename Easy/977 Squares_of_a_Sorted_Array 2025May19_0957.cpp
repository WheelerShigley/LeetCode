class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int size = nums.size();
        vector<int> squares(size);
        int front_index = 0, back_index = size-1, position = back_index;
        
        while(front_index <= back_index) {
            if( abs(nums[back_index]) < abs(nums[front_index]) ) {
                squares[position--] = nums[front_index] * nums[front_index];
                front_index++;
            } else {
                squares[position--] = nums[back_index] * nums[back_index];
                back_index--;
            }
        }
        return squares;
    }
};