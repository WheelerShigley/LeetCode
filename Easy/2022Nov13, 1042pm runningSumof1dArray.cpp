#include <iostream>
using std::cout;
#include <vector>
using std::vector;

class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int accumulator = 0;
        vector<int> output;
        
        //iterate through list, adding each time
        for(int i = 0; i < nums.size(); i++) {
            accumulator += nums.at(i);
            output.push_back(accumulator);
        }
        
        //return value
        return output;
    }
};

int main() {
   //declare objects
   Solution solutionInstance;
   vector<int> nums = {1,2,3,4,5};
   
   //calculate solution
   vector<int> out = solutionInstance.runningSum(nums);
   
   //print result
   cout << "[";
   for(int i = 0; i < out.size(); i++) { cout << out.at(i) << ","; }
   cout << "\b]\n";
   
return 0;  }