#include <vector>
using std::vector;
#include <iostream>
using std::cout;

class Solution {
public:
    int pivotIndex(vector<int>& nums) {
      //constraint A
      //if( 10000 < nums.size() || nums.size() < 0 ) { return -1; /*invalid*/ }
      
      //construct instance variables
      int accumulator = 0; int moving_total = 0;
      for(int i = 0; i < nums.size(); i++) {
         //constraint B
         //if( 1000 < nums[i] || nums[i] < -1000 ) { return -1; /*invalid*/ }
      
         moving_total += nums[i]; //starts at position 1
      } 
    
      //iterate through list, looking at the accumulator and right_sum, if equal, return index (leftmost)
      for(int i = 0; i < nums.size(); i++) {
         //update position
         moving_total -= nums[i]; if(0 < i) { accumulator += nums[i-1]; }
         //return if equal
         if(moving_total == accumulator) { return i; }
      }
         //if nothing returned, return failure value
         return -1;
    }
};

int main() {
   //instance variables
   Solution solutionInstance;
   
   //tests
   vector<int> one = {1,7,3,6,5,6};
   cout << solutionInstance.pivotIndex(one) << "\n";
   vector<int> two = {1,2,3};
   cout << solutionInstance.pivotIndex(two) << "\n";
   vector<int> three = {2,1,-1};
   cout << solutionInstance.pivotIndex(three) << "\n";
   
return 0;  }