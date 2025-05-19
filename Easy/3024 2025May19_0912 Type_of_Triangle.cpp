class Solution {
public:
    string triangleType(vector<int>& nums) {
        int a = nums.at(0);
        int b = nums.at(1);
        int c = nums.at(2);

        if(a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        if(a == b && a == c) {
            return "equilateral";
        }
        if(a == b || b == c || a == c) {
            return "isosceles";
        }
        return "scalene";
    }
};