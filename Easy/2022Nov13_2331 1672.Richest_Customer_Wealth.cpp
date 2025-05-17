#include <vector>
using std::vector;
#include <iostream>
using std::cout;

class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        //initialize values
        int temp, maximum = 0b10000000000000000000000000000000; //smallest integer value
        
        //iterate through each user
        for(int customer = 0; customer < accounts.size(); customer++) {
            temp = 0; //reset "wealth" for new user
            //iterate through each account the customer has
            for(int account = 0; account < accounts.at(customer).size(); account++) {
            temp += accounts.at(customer).at(account); //accumulate "wealth" value
            }
        //change maximum to temp if temp is larger
        if(maximum < temp) { maximum = temp; }
        }
        
        //return maximum found account value
        return maximum;
    }
};

int main() {
   //instance variables
   Solution solutionInstance;
   
   //test examples
   vector< vector<int> > user = { {1,2,3} , {3,2,1} };
   cout << solutionInstance.maximumWealth(user) << "\n";
                         user = { {1,5} , {7,3} , {3,5} };
   cout << solutionInstance.maximumWealth(user) << "\n";
                         user = { {2,8,7} , {7,1,3} , {1,9,5} };
   cout << solutionInstance.maximumWealth(user) << "\n";

return 0;  }