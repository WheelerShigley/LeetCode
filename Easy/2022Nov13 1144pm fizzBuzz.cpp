#include <vector>
using std::vector;
#include <string>
using std::string; using std::to_string;
#include <iostream>
using std::cout;

class Solution {
public:
    vector<string> fizzBuzz(int n) {
        //initialize variable(s)
        vector<string> answers;
        
        //iterate through each n, checking conditions
        for(int pos = 1; pos < n+1; pos++) {
            if( pos%3 == 0 && pos%5 == 0) { answers.push_back("FizzBuzz"); continue; }
            if( pos%3 == 0) { answers.push_back("Fizz"); continue; }
            if( pos%5 == 0) { answers.push_back("Buzz"); continue; }
            answers.push_back( to_string(pos) ); //default
        }
        
        //return conclusion
        return answers;
    }
};

void printList(vector<string> input) {
   cout << "[";
   for(int pos = 0; pos < input.size(); pos++) {
      cout << input.at(pos) << ",";
   }
   cout << "\b]\n";
}

int main() {
   //instance variables
   Solution solutionInstance;
   
   //test examples
   printList( solutionInstance.fizzBuzz(3)  );
   printList( solutionInstance.fizzBuzz(5)  );
   printList( solutionInstance.fizzBuzz(15) );
   
return 0;  }