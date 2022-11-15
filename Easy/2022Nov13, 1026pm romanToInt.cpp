#include <string>
using std::string; using std::to_string;
#include <iostream>
using std::cout;

class Solution {
public:
    int romanToInt(string s) {
        //constrints
        //if( 15 < s.size() ) { return -1; /*invalid*/ }
        //intialize variables
        int numbers[ s.size()+1 ]; numbers[ s.size() ] = 0;
        
        //go through each variables, converting to integer value
        for(int i = 0; i < s.size(); i++) {
            switch(s[i]) {
                case 'I': numbers[i] = 1;    break;
                case 'V': numbers[i] = 5;    break;
                case 'X': numbers[i] = 10;   break;
                case 'L': numbers[i] = 50;   break;
                case 'C': numbers[i] = 100;  break;
                case 'D': numbers[i] = 500;  break;
                case 'M': numbers[i] = 1000; break;
                default:  numbers[i] = 0;
            }
        }
        
        //go through list of numbers, subtracting when appropriate
        int current, next, accumulator = 0;
        for(int i = 0; i < s.size(); i++) {
            //check next two values in queue. If current is smaller than next: next has current subtracted (and current is not added)
            current = numbers[i]; next = numbers[i+1];
            //cout << "current: " << current << ", next:" << next << "\n";
            if(current < next) { numbers[i+1] -= current; } else { accumulator += current; }
        }
        
        //return value
        return accumulator;
        
    } //end romanToInt() function
}; //end class

int main() {
   Solution solutionInstance;
   cout << to_string( solutionInstance.romanToInt("IV") ) << "\n"; //4
   cout << to_string( solutionInstance.romanToInt("XXXIV") ) << "\n"; //34
   cout << to_string( solutionInstance.romanToInt("CXXIII") ) << "\n"; //123
   cout << to_string( solutionInstance.romanToInt("CCCLIV") ) << "\n"; //354
   cout << to_string( solutionInstance.romanToInt("MCCXLIX") ) << "\n"; //1249
return 0;  } //end main()