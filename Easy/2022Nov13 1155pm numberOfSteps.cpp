#include <iostream>
using std::cout;

class Solution {
public:
    int numberOfSteps(int num) {
        //initialize variables
        int current = num, step_counter = 0;
        
        //do steps until num is zero
        while(current != 0) {
            //if even, divide by 2 else decrement
            if(current%2 == 0) { current = current >> 1; } else { current--; }
            step_counter++;
        }
        //return step amount
        return step_counter;
    }
};

int main() {
   //instance variables
   Solution solutionInstance;
   
   //test examples
   cout << solutionInstance.numberOfSteps(14) << "\n";
   cout << solutionInstance.numberOfSteps(8) << "\n";
   cout << solutionInstance.numberOfSteps(123) << "\n";

return 0;  }